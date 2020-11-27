package String;

public class ImmuAndFinalTest {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("rahul");
		System.out.println(sb.hashCode());
		sb.append("jen");
		System.out.println(sb.hashCode());

		System.out.println(sb);
	}

}
