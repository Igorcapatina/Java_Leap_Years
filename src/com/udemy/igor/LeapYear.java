package com.udemy.igor;

public class LeapYear {
    public static boolean isleapYear(int year){
        if ((year >= 1 && year <= 9999) && ((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0))){
            return true;
        }else {return false;}

    }
}


