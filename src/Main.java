import java.io.*;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
          /*  FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/note.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();*/
            /*var test = "C:\\Users\\luan_prep_vn\\Desktop\\test.jpeg";
            System.out.println(test);
            */

      /*      FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/test.jpeg");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Documents/test.jpeg");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();*/


            /*FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/note.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedInputStream.close();
            fileInputStream.close();*/

            /*FileReader fileReader = new FileReader("/Users/luan_prep_vn/Desktop/note.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();*/

            String imagePath = "https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/anh-dep-thien-nhien-2-1.jpg";
            URI uri = new URI(imagePath);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(uri.toURL().openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Documents/anh-dep.jpg");
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();

            bufferedInputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
