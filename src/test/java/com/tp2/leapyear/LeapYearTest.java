package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {


    @Test
    void exampleTest(){
        assertEquals(4, 2 + 1);
    }

    @Test
    void TestDivisibleByFour(){
        LeapYear object = new LeapYear();
        boolean Value = object.DivisibleByFour(2000);
        assertEquals(true, Value );
    }
    @Test
    void TestNotDivisibleByHundred(){
        LeapYear object = new LeapYear();
        boolean Value = object.NotDivisibleByHundred(52);
        assertEquals(true, Value );
    }
    @Test
    void TestDivisibleByFourHundred(){
        LeapYear object = new LeapYear();
        boolean Value = object.DivisibleByFourHundred(400);
        assertEquals(true, Value );
    }









//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
