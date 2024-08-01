import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java36",
                    "root", "koodinh@");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM categories";
            ResultSet resultSet = statement.executeQuery(sql);
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
