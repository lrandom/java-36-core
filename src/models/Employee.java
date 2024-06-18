package models;

import java.io.Serializable;

public class Employee implements Serializable {
    String id;
    int age;
    String name;
    float salary;

    public Employee(String id, int age, String name, float salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
