package at.fhtw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainTest {

    @Test
    public void  contextLoads() {
        //Arrange

        //Act
        long summe2 = 3;
        //Assert
        assertEquals(3,summe2);
    }
}