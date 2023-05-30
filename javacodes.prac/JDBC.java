import java.sql.*;
public class Sample_JDBC_Program {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException 
	{
		String QUERY = "select * from employee_details";
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeedata","root","root"))
		{
			Statement statemnt1 = conn.createStatement();
			ResultSet rs1 = statemnt1.executeQuery(QUERY); 
			{ 
				while(rs1.next())
				{
					int empNumber = rs1.getInt("empNumber");
					String lastName = rs1.getString("lastName");
					String firstName = rs1.getString("firstName");
					String email = rs1.getString("email");
					String deptNum = rs1.getString("deptNum");
					String salary = rs1.getString("salary");
					System.out.println(empNumber + "," +lastName+ "," +firstName+ ","+email +","+deptNum +"," +salary);
					}
				} 
			}
		catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
