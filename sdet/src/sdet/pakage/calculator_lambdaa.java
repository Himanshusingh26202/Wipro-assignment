package sdet.pakage;
interface Calculator{
	int num( int a, int b );
}
public class calculator_lambdaa {
public static void main (String[] args) {
	
	Calculator add = (a, b) -> a+b;
	
	Calculator sub = (a, b) -> a-b;
	
	Calculator mul = (a, b) -> a*b;
	
	Calculator div = (a, b) -> b !=0 ? a/b : 0;
	int a = 10;
	int b =30;
	System.out.println("Division "+ div.num(a, b));
	System.out.println("Addition "+ add.num(a, b));		
	System.out.println("Subtraction "+ sub.num(a, b));
	System.out.println("Multiplication "+ mul.num(a, b));
}

}
