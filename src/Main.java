import dals.StudentDal;
import models.Student;
import views.StudentView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("Vui long chon");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi sinh vien");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    StudentView.addStudent();
                    break;
                case 2:
                    StudentView.showStudent();
                    break;
            }
        } while (true);
    }
}
