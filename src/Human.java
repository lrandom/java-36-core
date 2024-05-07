public class Human {
    static  String className = "Human";

    float height;
    float weight;
    String name;
    int age;
    String job;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(float height, float weight, String name, int age, String job) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    static void sayHello() {
        System.out.println("Hello From Human Class");
    }

}
