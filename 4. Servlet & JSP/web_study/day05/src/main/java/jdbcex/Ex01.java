package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // 동적
        
       // String url = "jdbc:mysql://localhost:3306/madang?user=madang&password=madang";
        String url = "jdbc:mysql://localhost:3306/madang";
        String user = "madang", password="madang";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {
            String bookname = "책1";
            String sql = "INSERT INTO book2 VALUES (2, '" + bookname + "', '출판사2', 10000)"; // 보안적으로 안전하지 못하기 때문에 좋지 않음
            //String sql = "INSERT INTO book2 VALUES (2, '책2', '출판사2', 10000)"; // 이 방식이 더 안전
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
