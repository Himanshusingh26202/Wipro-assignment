package Library;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print(" Username: ");
	        String username = sc.nextLine();

	        System.out.print(" Password: ");
	        String password = sc.nextLine();

	        if (!LoginService.login(username, password)) {

	            System.out.println(" Login failed. Exiting...");
	            return;
	        }

	        while (true) {

	        	System.out.println("\n📚 Library Management Menu");
	        	System.out.println("1. Add Book");
	        	System.out.println("2. View Books");
	        	System.out.println("3. Search Book");
	        	System.out.println("4. Register Student");
	        	System.out.println("5. View Students");
	        	System.out.println("6. Add Member");
	        	System.out.println("7. View Members");
	        	System.out.println("8. Issue Book");
	        	System.out.println("9. Generate Fine");
	        	System.out.println("10. Exit");

	            System.out.print("Choose option: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	            case 1 -> BookService.addBook(sc);

	            case 2 -> BookService.viewBooks();

	            case 3 -> BookService.searchBook(sc);

	            case 4 -> StudentService.registerStudent(sc);

	            case 5 -> StudentService.viewStudents();

	            case 6 -> MembersService.addMember(sc);

	            case 7 -> MembersService.viewMembers();

	            case 8 -> IssueBookService.issueBook(sc);

	            case 9 -> FineService.generateFine(sc);

	            case 10 -> {

	                System.out.println("🔚 Goodbye!");
	                return;
	            }

	                default -> System.out.println(" Invalid option");
	            }
	        }
	    }
	
}
