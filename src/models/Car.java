package models;

public class Car extends ABCar {
    @Override
    public void turnOnCar() {
        System.out.println("Turn on car");
    }
}
