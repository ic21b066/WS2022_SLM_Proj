package at.fhtw;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void Controller_ShouldReturnDefaultMessage() {
        assertThat(this.testRestTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Hello, Tester!");
    }

    @Test
    public void Controller_shouldDeliverNullString() {
        //Arrange
        String expResult = "123";

        //Act
        String actualResult = testRestTemplate.getForObject("http://localhost:" + port + "/api/message", String.class);

        //Assert
        assertEquals(expResult, actualResult);
    }

    @Test
    public void Controller_shouldDeliverOKString(){
        //Arrange
        String expResult = "OK";

        //Act
        String actualResult = testRestTemplate.getForObject("http://localhost:" + port + "/api/message/set?m=123", String.class);

        //Assert
        assertEquals(expResult, actualResult);
    }

    @Test
    public void Controller_shouldDeliverOKAnswer(){
        //Arrange

        //Act
        ResponseEntity<String> actualResult = testRestTemplate.getForEntity("http://localhost:" + port + "/api/message/set?m=A", null, String.class);

        //Assert
        assertEquals(200, actualResult.getStatusCodeValue());
    }
}