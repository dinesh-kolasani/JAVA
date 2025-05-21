import java.util.Scanner;

public class OperatorsBasicExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n--- Ternary Operator ---");

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		String status = (age >= 18) ? "Adult" : "Minor";
		System.out.println("Ternary Operator Result: " + "You are an " + status);

		System.out.print("\nEnter first value to comparing two values: ");
		int x = scanner.nextInt();

		System.out.print("Enter second value to comparing two values: ");
		int y = scanner.nextInt();
		
		String result = (x > y) ? "x is greater value" : "y is greater value";
        	System.out.println("Ternary result: " + "Your given x is " + x + " and y is " + y + " After comparing " + result);

		System.out.println("\n--- Unary Operator ---");

		System.out.print("Enter any value: ");
		int num = scanner.nextInt();

		System.out.println("Original value: " + num);
        	System.out.println("Post-increment value: " + num++ + ", After increment: " + num);
        	System.out.println("Pre-increment value: " + ++num + ", Before increment: " + num);
		
		System.out.println("\nPre-decrement: " + --num + ", Before decrement: " + num);
		System.out.println("Post-decrement: " + num-- + ", After decrement: " + num);
		
	}
}