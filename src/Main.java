public class Main {
    public static void main(String[] args) {
        Human luan = new Human(
                1.72f,
                1.73f,
                "Luan",
                32,
                "Developer");
        luan.eat();
        luan.sleep();


        Human.sayHello();
        System.out.println(Human.className);
    }
}
