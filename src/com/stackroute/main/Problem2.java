package com.stackroute.main;

public class Problem2 {
    public String  checkPowerOfFour(String str){
        double num;
        if(str == null)
            return "No input is given";
        try{
            num = Double.parseDouble(str);
            if(num <= 0){
                return "Number should be greater than 0";
            }

        } catch (Exception e) {
            return "Wrong input";
        }
        double i = Math.log(num) / Math.log(4);
        if(i == Math.floor(i)){
            return "Power of 4";
        }
        return "Not power of 4";
    }
}
