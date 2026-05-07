  package Day_11_Assignment;
  import java.util.*;
public class Remove_dub_char_str {

	public static void main(String[] args) {
		String str = "programming";
		Set<Character>set = new HashSet<>();
		
		String result = "";
		for(char ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				result +=ch;
			}
		}
		System.out.println(result);
	}

}
