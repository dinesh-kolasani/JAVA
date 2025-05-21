import java.util.Arrays;
public class StringDemo {
	public static void main(String[] args) {
		
		// Creating string Literal approach
		String str1 = "Dinesh";
		String str2 = "Raj";

		// Creating new keyword approach
		String str3 = new String("Hello World");

		// Creating character array
		char arr[] = {'j','a','v','a'};
		String str4  = new String(arr);
		
		String result = str1.concat(" ").concat(str2);

		System.out.println("Character array string: " + str4);
		System.out.println("Adding two strings: " + result);
		System.out.println("Length of string: " + result.length());
		System.out.println("Uppercase string: " + result.toUpperCase());
		System.out.println("Lowercase string: " + result.toLowerCase());
		System.out.println(str1 + " compare with " + str2 + " is: " + str1.equals(str2));
		System.out.println("index of " + str2 + result.indexOf("Raj")); 
		System.out.println("Character at index 2 in " + str1 + " is: " + str1.charAt(2));
		System.out.println(result + " contains " + str2 + result.contains(str2));

		String replace = result.replace("Raj", "K");
		System.out.println("Replaced string: " + replace);
		
		char[] charArray = str1.toCharArray();
		System.out.println("String into a Character array: " + Arrays.toString(charArray));
	}
}