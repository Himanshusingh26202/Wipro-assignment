package Library;

import java.sql.*;
import java.util.Scanner;

public class IssueBookService {

	 public static void issueBook(Scanner sc) {

	        try (Connection con = DBConnection.getConnection()) {

	            System.out.print("Enter Student ID: ");
	            int studentId = sc.nextInt();

	            System.out.print("Enter Book ID: ");
	            int bookId = sc.nextInt();

	            sc.nextLine();

	            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
	            String issueDate = sc.nextLine();

	            System.out.print("Enter Return Date (YYYY-MM-DD): ");
	            String returnDate = sc.nextLine();

	            String sql = "INSERT INTO issue_book(student_id, book_id, issue_date, return_date) VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, studentId);
	            ps.setInt(2, bookId);
	            ps.setDate(3, Date.valueOf(issueDate));
	            ps.setDate(4, Date.valueOf(returnDate));

	            ps.executeUpdate();

	            System.out.println(" Book issued successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
