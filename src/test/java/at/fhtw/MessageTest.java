package at.fhtw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
//    @Test
//    public static void checkAdd(){
//        //Arrange
//        Message m = new Message();
//        //Act
//        long summe = m.add(2,2);
//        //Assert
//        assertEquals(4,summe);
//    }

    @ParameterizedTest
    @CsvSource({"Maintenance", "6"})
    public void Message_shouldReturnCorrect_Set(String actual){
        //Arrange
        Message m = new Message();

        //Act
        m.set(actual);
        String result = m.getMessage();

        //Assert
        assertEquals(result,actual);
    }

    @Test
    void Message_shouldReturnCorrect_Reset() {
        //Arrange
        Message m = new Message();
        //Act
        m.reset();
        String text = m.getMessage();
        //Assert
        assertEquals("Everything OK",text);
    }

   @Test
    void Message_shouldReturnCorrect_sayOK() {
       //Arrange
       Message m = new Message();
       //Act
       String text = m.sayOK();
       //Assert
       assertEquals("OK",text);
    }
}