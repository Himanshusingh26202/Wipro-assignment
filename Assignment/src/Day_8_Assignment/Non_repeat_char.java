package Day_8_Assignment;

import java.util.HashMap;
public class Non_repeat_char {

	public static void main(String[] args) {
	
      String str = "reasoning";
      char result = firstNonRepeating(str);
      if (result == '\0') {
    	  System.out.println("No non-repeating Character");
      }else {
    	  System.out.println("First Non-repeating Character:" + result);
      }
	

}
	public static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; 
    }
}
	
