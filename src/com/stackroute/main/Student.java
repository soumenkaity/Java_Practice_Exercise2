package com.stackroute.main;

import java.text.DecimalFormat;

public class Student {
    DecimalFormat df = new DecimalFormat("#.##");
    private int marks[];

    public double averageMarks(){
        int sum=0 ;
        for(int element:marks){
            sum+=element;
        }
        return Double.valueOf(df.format(sum/(double)marks.length));
    }
    public int maximumMarks(){
        int maximum=marks[0] ;
        for(int element:marks){
            if(element> maximum)
                maximum=element;
        }
        return maximum;
    }
    public int minimumMarks(){
        int minimum=marks[0] ;
        for(int element:marks){
            if(element<minimum)
                minimum=element;
        }
        return minimum;
    }
    public String takeInput(int n, int[] arr){
        if(n != arr.length)
            return "Array size is not matching with number of inputs";
        marks = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0 || arr[i] > 100)
                return arr[i]+" is not within the range 0-100";
            marks[i] = arr[i];
        }
        return averageMarks()+" "+maximumMarks()+" "+minimumMarks();
    }
}
