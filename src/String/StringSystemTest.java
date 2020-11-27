package String;

public class StringSystemTest {

	public static void main(String[] args) {
		String s = "aindrika soni";
		 s = s.toLowerCase();
		/*System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(sm(s));
		System.out.println(s);*/
		String[] names=s.split(" ");
		String fname=names[0];
		String lname=names[1];
		System.out.println(fname);
		System.out.println(lname);

		/*System.out.println(s.split("a")[0]);
		System.out.println(s.split("a")[1]);

		System.out.println(s.split("a")[2]);
*/
	}

	public static String sm(String s1) {
		return "hello" + s1;

	}

}
