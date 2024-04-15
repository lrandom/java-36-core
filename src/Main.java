import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String name = "Luan";
        int age = 32;
        String job = "Frontend Developer";
        System.out.println("I am " + age + "years old");
        System.out.printf("My name is %s, I am %d",name,age);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");
    }
}
