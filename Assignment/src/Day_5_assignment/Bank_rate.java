package Day_5_assignment;

import java.util.Scanner;

abstract class Bank{
	abstract double getInterstRate();
}
class SBI extends Bank{
	double getInterstRate() {
		return 6.5;
	}
}

class KOTAK extends Bank{
	double getInterstRate() {
		return 7.8;
	}
}

class HDFC extends Bank{
	double getInterstRate() {
		return 7.5;
	}
}

public class Bank_rate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Choose Bank:");
     System.out.println("1. SBI");
     System.out.println("2. KOTAK");
     System.out.println("3. HDFC");
     
     int choice = sc.nextInt();
     Bank bank = null;
     switch (choice) {
     case 1:
    	 bank = new SBI();
    	 break;
     case 2:
    	 bank = new KOTAK();
    	 break;
     case 3:
    	 bank = new HDFC();
    	 break;
    	 default:
    		 System.out.println("Invalid Choice.");
    	 
     }
     System.out.println("Interest Rate:" + bank.getInterstRate()+ "%");
	sc.close();
	}

}
