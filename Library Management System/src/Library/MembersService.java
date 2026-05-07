package Library;

import java.sql.*;
import java.util.Scanner;

public class MembersService {

	 public static void addMember(Scanner sc) {

	        try (Connection con = DBConnection.getConnection()) {

	            System.out.print("Member Name: ");
	            String name = sc.nextLine();

	            System.out.print("Email: ");
	            String email = sc.nextLine();

	            System.out.print("Phone: ");
	            String phone = sc.nextLine();

	            System.out.print("Address: ");
	            String address = sc.nextLine();

	            String sql =
	            "INSERT INTO members(name, email, phone, address) VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, name);
	            ps.setString(2, email);
	            ps.setString(3, phone);
	            ps.setString(4, address);

	            ps.executeUpdate();

	            System.out.println("✅ Member added successfully.");

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }

	    // VIEW MEMBERS

	    public static void viewMembers() {

	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "SELECT * FROM members";

	            Statement stmt = con.createStatement();

	            ResultSet rs = stmt.executeQuery(sql);

	            System.out.printf(
	            "\n%-5s %-20s %-25s %-15s %-30s\n",
	            "ID", "Name", "Email", "Phone", "Address");

	            while (rs.next()) {

	                System.out.printf(
	                "%-5d %-20s %-25s %-15s %-30s\n",

	                rs.getInt("member_id"),
	                rs.getString("name"),
	                rs.getString("email"),
	                rs.getString("phone"),
	                rs.getString("address"));
	            }

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }
	
}
