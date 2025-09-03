package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    @Test
    void exampleTest(){
        assertEquals(4, 2 + 2);
    }
    @Test
    void TestEmptyString(){
        StringCalculator object = new StringCalculator();
        assertEquals(0, object.add(""));
    }
    @Test
    void TestSingleNumber(){
        StringCalculator object = new StringCalculator();
        assertEquals(4, object.add("4"));
    }
    @Test
    void TestSumOFTwoNumbers(){
        StringCalculator object = new StringCalculator();
        assertEquals(7, object.add("3,4"));
    }
    @Test
    void TestMultiplicationOfMultipleNumbers(){
        StringCalculator object = new StringCalculator();
        assertEquals(6, object.add("1,2,3"));
    }
    @Test
    void NumbersSeparated(){
        StringCalculator object = new StringCalculator();
        assertEquals(6, object.add("1\n2,3"));
    }
    @Test
    void NegativeNumbers(){
        StringCalculator object = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> object.add("-1"));

    }




//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
