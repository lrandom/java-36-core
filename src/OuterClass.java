public class OuterClass {
    private String name = "OuterClass";

    static String staticName = "OuterClass";
    class InnerClass {
        public void location() {
            System.out.println("I am in " + name);
        }
    }

    static class StaticInnerClass{
        public void location() {
            System.out.println("I am in "+staticName);
        }
    }


    public void run() {
        class MethodLocalClass{
            public void location() {
                System.out.println("I am in "+name);
            }
        }

        MethodLocalClass obj = new MethodLocalClass();
        obj.location();

    }

}
