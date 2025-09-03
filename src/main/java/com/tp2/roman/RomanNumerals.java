package com.tp2.roman;

public class RomanNumerals {


    public String BasicNumbers(int number) {
        if (number == 1) {
            return "I";
        }
        if (number == 5) {
            return "V";
        }
        if (number == 10) {
            return "X";
        }
        throw new IllegalArgumentException("Número no soportado en BasicNumbers");
    }


    public String SubtractionCases(int number) {
        if (number == 4) {
            return "IV";
        }
        if (number == 9) {
            return "IX";
        }
        throw new IllegalArgumentException("Número no soportado en SubtractionCases");
    }


    public String ComplexNumbers(int number) {
        if (number == 40) {
            return "XL";
        }
        if (number == 50) {
            return "L";
        }
        if (number == 90) {
            return "XC";
        }
        if (number == 100) {
            return "C";
        }
        if (number == 400) {
            return "CD";
        }
        if (number == 500) {
            return "D";
        }
        if (number == 900) {
            return "CM";
        }
        if (number == 1000) {
            return "M";
        }
        throw new IllegalArgumentException("Número no soportado en ComplexNumbers");
    }
}

// TODO: Implement roman numeral conversion following TDD approach
// Start with basic numbers: 1=I, 5=V, 10=X
// Then handle subtraction cases: 4=IV, 9=IX
// Build up to complex numbers like 1994=MCMXCIV
