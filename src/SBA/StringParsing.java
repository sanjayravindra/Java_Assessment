package SBA;

public class StringParsing {

	static String string2Manipulate = "   Sam woke up. Paper was on the coffee table. Sam read the paper. Tear or shred? Paper shredded!   ";

	public static void main(String[] args) {

		System.out.println("String before change:" + string2Manipulate);
		// write your code here
		string2Manipulate = string2Manipulate.trim();
		string2Manipulate = string2Manipulate.replaceAll("Sam", "Bheem");
		string2Manipulate = string2Manipulate.replaceFirst("Paper", "Newspaper");
		int lastIndex = string2Manipulate.lastIndexOf("Paper");
		System.out.println("String after change:" + string2Manipulate);
		System.out.println("Last position of Paper:" + lastIndex);
	}
}
