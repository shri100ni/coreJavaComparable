package String;

public class LetterPresentOrNot {

	public static void main(String[] args) {
		String umb = new String("Umbrella");
		boolean result = false;
		for (int i = 0; i < umb.length(); i++) {
			if (umb.charAt(i) == 'e') {
				result = true;
				System.out.println(i);
				break;
			}
		}
		System.out.println(result);
	}

}
