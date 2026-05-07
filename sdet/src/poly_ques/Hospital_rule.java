package poly_ques;

abstract class Hospital{
	abstract void patients();
	abstract void operation();
	
	void document()
	{
		System.out.println("hospital document and records");
	}
	void ot()
	{
		System.out.println("ot_records");
	}
}

class Nurse extends Hospital{
	
}
public class Hospital_rule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
