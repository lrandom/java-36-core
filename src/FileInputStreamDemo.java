import java.io.*;
import java.net.URI;

public class FileInputStreamDemo {

    public static void main(String[] args) {
/*        try {
            FileInputStream fis = new FileInputStream("/Users/luan_prep_vn/Desktop/note.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch (Exception e) {

        }*/

/*        try {
            FileReader fileReader = new FileReader("/Users/luan_prep_vn/Desktop/note.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {

        }*/


/*        String hello = "Hello VietNam";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Desktop/note-2.txt");
            fileOutputStream.write(hello.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {

        }*/


/*        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/luan_prep_vn/Desktop/anh-1.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Documents/anh-copy-1.jpg");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();

        } catch (Exception e) {

        }*/

        try {
            URI uri = new URI("https://images2.thanhnien.vn/528068263637045248/2024/1/25/e093e9cfc9027d6a142358d24d2ee350-65a11ac2af785880-17061562929701875684912.jpg");
            InputStream inputStream = uri.toURL().openStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/luan_prep_vn/Documents/document-test.jpg");
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            bufferedInputStream.close();

        } catch (Exception e) {

        }
    }
}
