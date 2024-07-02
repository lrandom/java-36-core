public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                student.wakeup();
                student.study();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                student.breakfast();
            }
        });

        t1.start();
        t2.start();
    }
}
