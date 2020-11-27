package String;

public class StringbufferTest {
public static void main(String[] args) {
	StringBuffer name=new StringBuffer("rajiv");
	
	System.out.println(name.append(" veshnav"));
	
	System.out.println(name.insert(5, ",raghuvan,"));
	System.out.println(name.delete(3, 6));
	System.out.println(name.reverse());
	System.out.println(name.capacity());
	System.out.println(name.length());
	System.out.println(name);
}
}
