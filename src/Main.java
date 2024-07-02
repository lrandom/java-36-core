

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Thread t =new MyThread("My Thread 1");
        Thread t2 = new MyThread("My Thread 2");
        t.start();
        t2.start();

    }
}
