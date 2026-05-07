package Library;

import java.sql.*;
import java.util.Scanner;

public class BookService {

	 public static void addBook(Scanner sc) {

	        try (Connection con = DBConnection.getConnection()) {

	            System.out.print("Book Title: ");
	            String title = sc.nextLine();

	            System.out.print("Author Name: ");
	            String author = sc.nextLine();

	            System.out.print("Category: ");
	            String category = sc.nextLine();

	            System.out.print("Quantity: ");
	            int quantity = sc.nextInt();
	            sc.nextLine();

	            String sql = "INSERT INTO books(title, author, category, quantity) VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, title);
	            ps.setString(2, author);
	            ps.setString(3, category);
	            ps.setInt(4, quantity);

	            ps.executeUpdate();

	            System.out.println(" Book added successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void viewBooks() {

	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "SELECT * FROM books";

	            Statement stmt = con.createStatement();

	            ResultSet rs = stmt.executeQuery(sql);

	            System.out.printf("\n%-5s %-25s %-20s %-15s %-10s\n",
	                    "ID", "Title", "Author", "Category", "Qty");

	            while (rs.next()) {

	                System.out.printf("%-5d %-25s %-20s %-15s %-10d\n",
	                        rs.getInt("book_id"),
	                        rs.getString("title"),
	                        rs.getString("author"),
	                        rs.getString("category"),
	                        rs.getInt("quantity"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void searchBook(Scanner sc) {

	        try (Connection con = DBConnection.getConnection()) {

	            System.out.print("Enter Book Title to Search: ");
	            String title = sc.nextLine();

	            String sql = "SELECT * FROM books WHERE title LIKE ?";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, "%" + title + "%");

	            ResultSet rs = ps.executeQuery();

	            boolean found = false;

	            System.out.printf("\n%-5s %-25s %-20s %-15s %-10s\n",
	                    "ID", "Title", "Author", "Category", "Qty");

	            while (rs.next()) {

	                found = true;

	                System.out.printf("%-5d %-25s %-20s %-15s %-10d\n",
	                        rs.getInt("book_id"),
	                        rs.getString("title"),
	                        rs.getString("author"),
	                        rs.getString("category"),
	                        rs.getInt("quantity"));
	            }

	            if (!found) {
	                System.out.println("❌ Book not found.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
