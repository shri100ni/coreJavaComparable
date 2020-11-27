package String;

public class ReplaceReplaceAllTest {

	public static void main(String[] args) {
		String myString = "one fish, two fish, three fish";

		String target = "fish";
		String replacement = "sheep";

		String newString = myString.replace(target, replacement);
		System.out.println(newString);
		
		
		String myString1 = "__1_6____3__6_345____0";

		String regex = "\\d";
		String replacement1 = "x";

		String newString1 = myString1.replaceAll(regex, replacement1);
		System.out.println(newString1);
		
		String myString2 = "   Horse         Cow\n\n   \r Camel \t\t Sheep \n Goat        ";

		String regex2 = "\\s";
		String replacement2 = "";

		String newString2 = myString2.replaceAll(regex2, replacement2); 
		System.out.println(newString2);
	}

}
