package com.stackroute.main;

public class User {
    private String fName, lName;
    private int age=-1;
    private double salary;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAge() {
        if(age != -1) {
            if (isValidAge())
                return "Age : " + age + " and it is valid";
            return "Age : " + age + " and it is not valid";
        }
        return "Age wasn't provided in the range of 0-100";
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            System.out.println("Not a valid input is given for age");
        else
            this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isValidAge(){
        if(age >= 18 && age <= 60)
            return true;
        return false;
    }

    public String getFullName(){
        return fName+" "+lName;
    }
}
