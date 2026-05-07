package Library;

import java.sql.*;
import java.util.Scanner;

public class FineService {

	public static void generateFine(Scanner sc) {

        try (Connection con = DBConnection.getConnection()) {

            System.out.print("Enter Issue ID: ");
            int issueId = sc.nextInt();

            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();

            System.out.print("Enter Fine Amount: ");
            double amount = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter Fine Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Enter Remarks: ");
            String remarks = sc.nextLine();

            String sql = "INSERT INTO fine(student_id, issue_id, fine_amount, fine_date, remarks) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentId);
            ps.setInt(2, issueId);
            ps.setDouble(3, amount);
            ps.setDate(4, Date.valueOf(date));
            ps.setString(5, remarks);

            ps.executeUpdate();

            System.out.println(" Fine generated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}
