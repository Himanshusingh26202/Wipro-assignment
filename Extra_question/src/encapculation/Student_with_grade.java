 package encapculation;
import java.util.*;
class Student{
	
	private int rollNo;
    private String name;
    private int marks;

    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Method to calculate grade
    public String calculateGrade() {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    
    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No : " + getRollNo());
        System.out.println("Name    : " + getName());
        System.out.println("Marks   : " + getMarks());
        System.out.println("Grade   : " + calculateGrade());
    }
}
public class Student_with_grade {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        Student s1 = new Student();

	        // Taking input
	        System.out.print("Enter Roll Number: ");
	        s1.setRollNo(sc.nextInt());
	        sc.nextLine();

	        System.out.print("Enter Student Name: ");
	        s1.setName(sc.nextLine());

	        System.out.print("Enter Marks: ");
	        s1.setMarks(sc.nextInt());

	        // Display result
	        s1.display();

	        sc.close();
	}

}
