package views;

import dals.StudentDal;
import models.Student;

import java.util.Scanner;

public class StudentView {
    public static void addStudent() {
        System.out.println("Thêm sinh viên");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        StudentDal studentDal = new StudentDal();
        studentDal.add(new Student(id, name, age, address));
    }

    public static void showStudent() {
        StudentDal studentDal = new StudentDal();
        System.out.println("Danh sách sinh viên");
        for (Student student : studentDal.getList()) {
            System.out.println("Mã sinh viên: " + student.getId());
            System.out.println("Tên sinh viên: " + student.getName());
            System.out.println("Tuổi sinh viên: " + student.getAge());
            System.out.println("Địa chỉ sinh viên: " + student.getAddress());
        }
    }
}
