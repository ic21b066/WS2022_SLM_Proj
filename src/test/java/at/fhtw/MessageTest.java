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

//    @ParameterizedTest
//    @CsvSource({"2,2,4", "-2,8,6","256,1024,1280"})
//    public void Controller_shouldReturnCorrectSum_AddIntegers(int numberOne, int numberTwo, long result){
//        //Arrange
//        Message m = new Message();
////        int firstNumber= numberOne;
////        int secondNUmber= numberTwo;
////        long expectedResult = result;
//
//        //Act
//        long actualResult= m.add(numberOne,numberTwo);
//
//        //Assert
//        assertEquals(result,actualResult);
//    }

    @Test
    void reset() {
        //Arrange
        Message m = new Message();
        //Act
        m.reset();
        String text = m.getMessage();
        //Assert
        assertEquals("Everything OK",text);
    }

   @Test
    void sayOK() {
       //Arrange
       Message m = new Message();
       //Act
       String text = m.sayOK();
       //Assert
       assertEquals("OK",text);
    }
}