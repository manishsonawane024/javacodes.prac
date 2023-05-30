import java.sql.*;

public class databaseConnection {
public static void main(String args[]) {
try {
Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedata", "root", "root");
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from students");
System.out.println(("Students Database : "));
while (rs.next()) {
System.out
.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
}
connection.close();
}catch (Exception e) {
System.out.println(e);
}
}
}

