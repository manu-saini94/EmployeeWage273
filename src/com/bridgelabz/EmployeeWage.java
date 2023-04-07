package com.bridgelabz;

// Naming conventions
// variable -> camel case -> isPresent
// method -> camel case -> calculateWage()
// class and interface -> Pascal case -> EmployeeWage
// Constants -> All uppercase with underscores
// package -> all lowercase
public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to employeewage");
        int isPresent = (int) (Math.random() * 10) % 2;
        int dailyWage = 0;
        if (isPresent == 1) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present!");
        } else {
            System.out.println("Employee is Absent!");
        }
        System.out.println("Daily wage => " + dailyWage);
    }
}
