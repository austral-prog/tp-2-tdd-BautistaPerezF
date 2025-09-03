package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {


    @Test
    void exampleTest() {
        assertEquals(4, 2 + 1);
    }
    @Test
    void TestBasicNumbers () {
        RomanNumerals object = new RomanNumerals();
        assertEquals("I", object.BasicNumbers(1));
        assertEquals("V", object.BasicNumbers(5));
        assertEquals("X", object.BasicNumbers(10));
    }
    @Test
    void TestSubtractionCases(){
        RomanNumerals object = new RomanNumerals();
        assertEquals("IV", object.SubtractionCases(4));
        assertEquals("IX", object.SubtractionCases(9));
    }
    @Test
    void TestComplexNumbers(){
        RomanNumerals object = new RomanNumerals();
        assertEquals("XL", object.ComplexNumbers(40));
        assertEquals("L", object.ComplexNumbers(50));
        assertEquals("C", object.ComplexNumbers(100));
        assertEquals("CD", object.ComplexNumbers(400));
        assertEquals("D", object.ComplexNumbers(500));
        assertEquals("CM", object.ComplexNumbers(900));
        assertEquals("M", object.ComplexNumbers(1000));
        assertEquals("XC", object.ComplexNumbers(90));
    }
}

//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
