package Inhertence;
class Grandparent
{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent extends Grandparent
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
public class multi_inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child mohan=new Child();
		mohan.flat();// self
		mohan.car();// parent
		mohan.bike();// parent
		mohan.openland();// grandparent
		
		Parent soham=new Parent();
		soham.flat();
		soham.car();
	}

}
