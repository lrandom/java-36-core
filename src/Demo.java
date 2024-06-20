public class Demo<T,K> {
    public void print(T t,K k) {
        System.out.println(t);
        System.out.println(k);
    }

    public static void main(String[] args) {
        Demo<String,Integer> demo = new Demo<>();
        demo.print("Hello, World!",42);

        Demo<Float,String> floatDemo = new Demo<>();
        floatDemo.print(3.14f, "Pi");
    }
}
