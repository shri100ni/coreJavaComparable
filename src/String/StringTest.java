package String;

public class StringTest {

	public static void main(String[] args) {
String name=new String("rahul verma");
String name1=new String("rahul verma");

String name2="rahul";
String name3="rahul";
System.out.println(name==name1);
System.out.println(name.equals(name1));

System.out.println(name2==name3);
System.out.println(name2.equals(name3));
System.out.println(name3.toLowerCase());

/*System.out.println(name.hashCode());
System.out.println(name1.hashCode());
System.out.println(name2.hashCode());
System.out.println(name3.hashCode());
*/
System.out.println(name3.split("rahu"));
/*System.out.println(name3.indexOf("h"));
System.out.println(name1.replace("rahul", "vishvjeet"));
System.out.println(name.indexOf("rahul"));

System.out.println(name1.lastIndexOf("a"));
System.out.println(name.charAt(2));
System.out.println(name.length());
System.out.println(name.concat("indore"));
System.out.println(name.substring(0, 5));
System.out.println(name.substring(6));
System.out.println(name.substring(4, 7));*/

	}

}
