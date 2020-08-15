package com.me.test;

import javax.swing.*;

public class Person {
    String firstName;
    String lastName;
    int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if (age < 15 || age >= 20) {
            return false;
        }else{
            return true;
        }
    }
    public String fullName(){
        return firstName + lastName;
    }
}
