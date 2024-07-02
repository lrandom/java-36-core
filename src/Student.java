public class Student {
    public synchronized void wakeup() {
        System.out.println("Student wakes up");
        try {
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void study() {
        System.out.println("Student is studying at home");
    }

    public synchronized void breakfast() {
        System.out.printf("Student is having breakfast\n");
        notify();
    }
}
