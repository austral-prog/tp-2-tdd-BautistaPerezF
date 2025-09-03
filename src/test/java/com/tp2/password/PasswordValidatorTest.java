package com.tp2.password;

import com.tp2.leapyear.LeapYear;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    @Test
    void exampleTest(){
        assertEquals(4, 2 + 1);
    }

    @Test
    void TestCharacters(){
        PasswordValidator object = new PasswordValidator();
        boolean Value = object.Characters("hola");
        assertEquals(false, Value );
    }
    @Test
    void TestContainsUpper(){
        PasswordValidator object = new PasswordValidator();
        boolean Value = object.ContainsUpper("P");
        assertEquals(true, Value );
    }
    @Test
    void TestContainsLower(){
        PasswordValidator object = new PasswordValidator();
        boolean Value = object.ContainsLower("p");
        assertEquals(true, Value );
    }
    @Test
    void TestContainsNumber(){
        PasswordValidator object = new PasswordValidator();
        boolean Value = object.ContainsNumber("1");
        assertEquals(true, Value );
    }
    @Test
    void TestContainsSpecial(){
        PasswordValidator object = new PasswordValidator();
        boolean Value = object.ContainsSpecial("@");
        assertEquals(true, Value );
    }


//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
