public class Demo2 {
    public <T> void print(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.print("Hello, World!");

        Demo2 floatDemo = new Demo2();
        floatDemo.print(3.14f);
    }
}
