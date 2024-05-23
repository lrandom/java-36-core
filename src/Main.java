import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
          /*  FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/note.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();*/

            FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/test.jpeg");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Documents/test.jpeg");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
