package Library;

import java.sql.*;
import java.util.Scanner;

public class StudentService {

	 public static void registerStudent(Scanner sc) {

	        try (Connection con = DBConnection.getConnection()) {

	            System.out.print("Student Name: ");
	            String name = sc.nextLine();

	            System.out.print("Department: ");
	            String department = sc.nextLine();

	            System.out.print("Phone: ");
	            String phone = sc.nextLine();

	            String sql = "INSERT INTO students(name, department, phone) VALUES (?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, name);
	            ps.setString(2, department);
	            ps.setString(3, phone);

	            ps.executeUpdate();

	            System.out.println("✅ Student registered successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void viewStudents() {

	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "SELECT * FROM students";

	            Statement stmt = con.createStatement();

	            ResultSet rs = stmt.executeQuery(sql);

	            System.out.printf("\n%-5s %-20s %-20s %-15s\n",
	                    "ID", "Name", "Department", "Phone");

	            while (rs.next()) {

	                System.out.printf("%-5d %-20s %-20s %-15s\n",
	                        rs.getInt("student_id"),
	                        rs.getString("name"),
	                        rs.getString("department"),
	                        rs.getString("phone"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
