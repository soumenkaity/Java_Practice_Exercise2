package com.stackroute.main;

public class Problem1 {
    public String checkPalindrome(String str){
        if(str == null){
            return "No input is given";
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbReverse = sb.reverse();
        if (str.equals(String.valueOf(sbReverse))){
            return "Input is palindrome";
        }
        return "Input is not palindrome";
    }
}
