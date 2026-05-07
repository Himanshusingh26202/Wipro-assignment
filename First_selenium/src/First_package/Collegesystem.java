package First_package;

public class Collegesystem {
    static String college = "HIT";
 
    int roll; 
    
    public void showDetailes() {
    	String activity = "Sports";
    	
    	System.out.println("College: "+ college);
    	System.out.println("Roll no:" + roll);
    	System.out.println("Activity: " + activity);
    }
    
    public static void main(String[] args) {
    	Collegesystem student1 = new Collegesystem();
    	student1.roll = 101;
    	
    	student1.showDetailes();
    }
}
