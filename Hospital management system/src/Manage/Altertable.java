package Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Altertable {
	public static void main(String[] args)  {
		String url="jdbc:mysql://localhost:3306/hospital_db";
		String user="root";
		String password="Himanshu@1234";
		
		// alter query
				String alterSQL="alter table students add address varchar(50)";

				// update queries
				String update1="update students set per=95,address='Delhi' where rollno=101";
				String update2="update students set per=90,address='Mumbai' where rollno=102";
				String update3="update students set per=85,address='Kolkata' where rollno=103";

				try
				{
					// driver loading
					Class.forName("com.mysql.cj.jdbc.Driver");

					// connection create
					Connection con=DriverManager.getConnection(url,user,password);

					System.out.println("Connection created");

					// statement create
					Statement stmt=con.createStatement();

					// alter table
					stmt.executeUpdate(alterSQL);

					System.out.println("Address column added");

					// update records
					stmt.executeUpdate(update1);
					stmt.executeUpdate(update2);
					stmt.executeUpdate(update3);

					System.out.println("Records updated");

					// print full table
					ResultSet rs=stmt.executeQuery("select * from students");

					System.out.println("rollno\t name\t per\t email\t\t\t address");

					while(rs.next())
					{ 
						int rollno=rs.getInt("rollno");
						String name=rs.getString("name");
						int per=rs.getInt("per");
						String email=rs.getString("email");
						String address=rs.getString("address");

						System.out.println(rollno+"   "+name+"   "+per+"   "+email+"   "+address);
					}

					stmt.close();
					con.close();
				}

				catch(Exception e)
				{
					System.out.println(e);
				}

		
 
	}
 
}// add new column students table
// update records for that column
// print table
 