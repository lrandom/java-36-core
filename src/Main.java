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

        int num = 10;
        //System.out.println(num++);//10
        System.out.println(++num);//11
        System.out.println(!true);//false
        System.out.println(!false);//true

        System.out.println(10 > 5);//true
        System.out.println(10 < 5);//false
        System.out.println(10 >= 5);//true
        System.out.println(10 <= 5);//false
        System.out.println(10 == 5);//false
        System.out.println(10 != 5);//true

        int a = 10;


    }
}
