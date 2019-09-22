package com.stackroute.main;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args){
        User user = new User();
        user.setfName("dfg");
        user.setlName("fghj");
        user.setAge(17);
        user.setSalary(50000);

        System.out.println(user.getFullName());
        System.out.println(user.getAge());
        System.out.println(user.getSalary());
    }

}
