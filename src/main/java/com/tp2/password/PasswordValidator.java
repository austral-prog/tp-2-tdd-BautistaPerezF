package com.tp2.password;

public class PasswordValidator {

    public boolean Characters(String password) {
        if (password == null) return false;
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    public boolean ContainsUpper(String palabra) {
        if (palabra == null) return false;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean ContainsLower(String palabra) {
        if (palabra == null) return false;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean ContainsNumber(String palabra) {
        if (palabra == null) return false;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean ContainsSpecial(String palabra) {
        if (palabra == null) return false;
        String specials = "!@#$%^&*()-_=+[]{}|;:'\\\",.<>?/";
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (specials.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}

// Consider these criteria:
// - Minimum 8 characters
// - At least 1 uppercase letter
// - At least 1 lowercase letter
// - At least 1 number
// - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
