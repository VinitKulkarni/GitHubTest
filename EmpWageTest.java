package com.bridgelabz.githubtest;

public class EmpWageTest {
    public static void main(String[] args) {
        System.out.println("welcome to emp wage program");

        int isPresent = (int)(Math.random()*10)%2;
        System.out.println(isPresent);
        int empHr = 0;

        if(isPresent == 1){
            System.out.println("emp is present");
            empHr = 8;
        }else{
            System.out.println("emp is absent");
            empHr = 0;
        }
    }
}
