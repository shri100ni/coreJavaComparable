package String;

public class DeleteConsonents {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello, have a good day");

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {
				s.deleteCharAt(i);
			}

		}
		System.out.println(s);
	}

}
