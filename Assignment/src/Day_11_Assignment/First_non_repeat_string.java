package Day_11_Assignment;

public class First_non_repeat_string {

	public static void main(String[] args) {
		String str = "programming";
		int[] count = new int[256];
		
		for (char ch : str.toCharArray()) {
			count [ch]++;
			
		}
		for (char ch : str.toCharArray()) {
			if (count[ch] ==1) {
				System.out.println("First non repeating character:" + ch);
				return;
			}
		}

	}

}
