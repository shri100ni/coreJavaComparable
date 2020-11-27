package String;

public class StringToCharTest {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			System.out.print(a);
		}
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}