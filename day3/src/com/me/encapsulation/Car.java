package com.me.encapsulation;
/*
Restricts direct access to data members (fields) of a class.
        Fields are set to private
Each field has a getter and setter method
        Getter methods return the field
        Setter methods let us change the value of the field

 */
public class Car {
    private int tires;
    private String make;
    private String model;

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main (String[] args){
        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Camry");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        Car junaidcar = new Car();
        junaidcar.setModel("lexus");
        junaidcar.setMake("rx350");
        junaidcar.setTires(4);
        System.out.println(junaidcar.getModel());
        System.out.println(junaidcar.getMake());
        System.out.println(junaidcar.getTires());

    }
}
