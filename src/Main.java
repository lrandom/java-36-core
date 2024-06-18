import models.Employee;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("1. Add employee");
            System.out.println("2. Find employee");
            System.out.println("3. Update employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Show All employee");
            int choice = 0;
            EmployeeManager employeeManager = new EmployeeManager();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Add employee
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter id: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter salary: ");
                    float salary = scanner.nextFloat();
                    Employee employee = new Employee(id, age, name, salary);
                    employeeManager.addEmployee(employee);
                    break;

                case 5:
                    // Show all employee
                    System.out.println("List employee: ");
                    for (Employee e : employeeManager.getEmployees()) {
                        System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Age: " + e.getAge() + " Salary: " + e.getSalary());
                    }
                    break;
            }
        } while (true);
    }
}
