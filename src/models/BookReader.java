package models;

import java.io.Serializable;

public class BookReader implements Serializable {
    private String name;
    private String phoneNumber;
    private String address;

    private int age;

    public BookReader(String name, String phoneNumber, String address, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
