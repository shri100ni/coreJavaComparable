package String;

public class NumberOfCharacters {

	public static void main(String[] args) {
		String s = new String("Hello Java");
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
