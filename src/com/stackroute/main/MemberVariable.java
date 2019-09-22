package com.stackroute.main;

public class MemberVariable {
    private Member member = new Member();
    public void initialiseVariables(String name, int age, double salary){
        member.setName(name);
        member.setAge(age);
        member.setSalary(salary);
    }
    public String showVariables(){
        return "Members Name: "+member.getName()+" Members Age: "+member.getAge()+" Members Salary: "+member.getSalary();
    }
}
