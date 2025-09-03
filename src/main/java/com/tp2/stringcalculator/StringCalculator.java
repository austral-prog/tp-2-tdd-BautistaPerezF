package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.equals("")) {
            return 0;
        }


        numbers = numbers.replace("\n", ",");

        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                int value = Integer.parseInt(part.trim());
                if (value < 0) {
                    throw new IllegalArgumentException("Negative numbers not allowed: " + value);
                }
                sum += value;
            }
        }
        return sum; // el return va afuera del for
    }
}
