package com.tp2.leapyear;


public class LeapYear {

    public boolean DivisibleByFour(int year){
        if (year%4==0){
            return true;
        }return false;
    }
    public boolean NotDivisibleByHundred(int year){
        if (year%100!=0){
            return true;
        }return false;
    }
    public boolean DivisibleByFourHundred(int year){
        if (year%400==0){
            return true; }
        return false; }
}
