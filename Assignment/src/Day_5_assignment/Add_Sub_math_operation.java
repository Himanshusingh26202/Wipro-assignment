package Day_5_assignment;

 class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
		
	}
 }
public class Add_Sub_math_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator calc = new Calculator();
      int sum = calc.add(10, 5);
      int diff = calc.subtract(10, 5);
      

      System.out.println("Addition: "+ sum);
      System.out.println("Subtract: "+ diff);
	}

}
