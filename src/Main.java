import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java36", "root",
                    "koodinh@");
            System.out.println("Connect success to DB");
            System.out.println("Vui long nhap ten danh muc: ");
            Scanner scanner = new Scanner(System.in);
            String category = scanner.nextLine();

            String sql = "INSERT INTO categories(name) VALUES('" + category + "')";
            Statement statement = connection.createStatement();
            int affectRow = statement.executeUpdate(sql);
            if (affectRow > 0) {
                System.out.println("Them moi thanh cong " + affectRow + " ban ghi");
            } else {
                System.out.println("Them moi that bai");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
