import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java36",
                    "root", "koodinh@");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM categories");
            resultSet.next();
            resultSet.absolute(2);
            while (resultSet.next()) {
                System.out.printf("Id ");
                System.out.printf("%d", resultSet.getInt("id"));
                System.out.printf("%n");
                System.out.printf("Name ");
                System.out.printf(resultSet.getString("name"));
                System.out.printf("%n");
                System.out.println("-------------------");
            }

            resultSet.beforeFirst();
            resultSet.next();
            resultSet.updateString("name", "Danh muc 1");
            resultSet.updateRow();
            while (resultSet.next()) {
                System.out.printf("Id ");
                System.out.printf("%d", resultSet.getInt("id"));
                System.out.printf("%n");
                System.out.printf("Name ");
                System.out.printf(resultSet.getString("name"));
                System.out.printf("%n");
                System.out.println("-------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
