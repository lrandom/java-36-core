import java.util.ArrayList;

public class Demo3 {
    void printArrayList(ArrayList<?> arr) {
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    void printArrayList2(ArrayList<? extends Number> arr) {
        for (Number n : arr) {
            System.out.println(n);
        }
    }

    void printArrayList3(ArrayList<? super Integer> arr) {
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        demo.printArrayList(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        demo.printArrayList2(numbers);

        ArrayList<Number> shorts = new ArrayList<>();
        shorts.add(1);
        shorts.add(2);
        shorts.add(3);
        demo.printArrayList3(shorts);
    }
}
