package com.me.test;

public class MainTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(20);
        System.out.println("FullName = " + person1.fullName()+ ", isTeen = "+ person1.isTeen());

        Person person2 = new Person();
        person2.setFirstName("Muhammad");
        person2.setLastName("");
        person2.setAge(15);
        System.out.println("FullName = " + person2.fullName()+ " isTeen = "+ person2.isTeen());

        Person person3 = new Person();
        person3.setFirstName("Muhammad");
        person3.setLastName("Shamsi");
        person3.setAge(15);
        System.out.println("FullName = " + person3.fullName()+ " isTeen = "+ person3.isTeen());

        Person person4 = new Person();
        person4.setFirstName("");
        person4.setLastName("Shamsi");
        person4.setAge(40);
        System.out.println("FullName = " + person4.fullName()+ " isTeen = "+ person4.isTeen());
    }
}
