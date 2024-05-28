import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/user.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            User user = (User) objectInputStream.readObject();
            System.out.println(user.getName());
            System.out.println(user.getJob());
        } catch (Exception e) {

        }
    }
}
