package at.fhtw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainTest {

    //sanity check test that will fail if the application context cannot start
    @Test
    void contextLoads() {
    }

    @Test
    public void Main_working_JUnitTest() {
        //Arrange
        long summe2;
        //Act
        summe2 = 3;
        //Assert
        assertEquals(3,summe2);
    }
}