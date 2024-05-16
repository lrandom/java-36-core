import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b");
        b = scanner.nextInt();
        try {
            System.out.println("Thuong hai so la " + (a / b));
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
        System.out.println("Tong hai so la " + (a + b));
    }
}
