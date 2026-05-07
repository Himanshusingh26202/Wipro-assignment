package Manage;
import java.sql.*;
public class Jdbc_conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url="jdbc:mysql://localhost:3306/hospital_db";
		String user="root";
		String password="Himanshu@1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		//create statement
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Student");
		System.out.println("rollno\t name\t per\t age");
		while(rs.next())
		{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			float per=rs.getFloat("per");
			int age=rs.getInt("age");
			System.out.println(rollno+"     "+ name+"     "+ per+ "     "+ age);
			
		}
		rs.close();
		stmt.close();
		con.close();
		System.out.println("Connection closed");
	}

}
