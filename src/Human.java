public class Human {
    static  String className = "Human";

    private float height;
    private float weight;
    private String name;
    private int age;
    private String job;

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Human.className = className;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getWeight() {
        return weight+"kg";
    }

    public void setWeight(float weight) {
        if(weight < 0) {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }
        if (weight > 500) {
            throw new IllegalArgumentException("Weight must be less than 500");
        }
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

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
