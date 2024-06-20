public class Demo<T> {
    public void print(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Demo<String> demo = new Demo<>();
        demo.print("Hello, World!");

        Demo<Float> floatDemo = new Demo<>();
        floatDemo.print(3.14f);
    }
}
