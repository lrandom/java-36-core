import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main2 {
    public static void main(String[] args) {
        User user = new User();
        user.setJob("Developer");
        user.setName("Luan");

        //save user to file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Desktop/user.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();
            fileOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
