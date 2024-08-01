import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java36",
                    "root", "koodinh@");
            System.out.println("Vui lòng nhập Email");
            String email = scanner.nextLine();

            System.out.println("Vui lòng nhập password");
            String password = scanner.nextLine();


            String sql = "SELECT id FROM users WHERE email='" + email + "' AND password='" + password + "'";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                System.out.println("Xác thư thành công");
            } else {
                System.out.println("Xác thực thất bại");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
