package Inhertence;
class Parent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Child extends Parent
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
public class Single_inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child mohan=new Child();
		mohan.flat();
		mohan.car();
		mohan.bike();
		
		Parent soham=new Parent();
		soham.flat();
		soham.car();
	}

}
