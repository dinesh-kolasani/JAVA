import java.util.Scanner;

public class OperatorsBasicExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter your second number: ");
		int num2 = scanner.nextInt();

		System.out.println("\n--- Arithmetic Operators ---");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

		System.out.println("\n--- Assignment Operators ----");
		System.out.println("before num1 : " + num1 + " += " + num2 + " -> " + (num1 += num2));
		System.out.println("after num1 : " + num1 + " -= " + num2 + " -> " + (num1 -= num2));
		System.out.println("after num1 : " + num1 + " *= " + num2 + " -> " + (num1 *= num2));
		System.out.println("after num1 : " + num1 + " /= " + num2 + " -> " + (num1 /= num2));
		System.out.println("after num1 : " + num1 + " %= " + num2 + " -> " + (num1 %= num2));

		System.out.println("\n--- Relational Operators ---");
		System.out.println(num1 + " == " + num2 + " ? " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " ? " + (num1 != num2));
		System.out.println(num1 + " > " + num2 + " ? " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " ? " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " ? " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " ? " + (num1 <= num2));

		System.out.println("\n--- Logical Operators ---");
		boolean a = true;
		boolean b = false;
		System.out.println(a + " && " + b + " : " + (a && b)); 
		System.out.println(a + " || " + b + " : " + (a || b));
		System.out.println("!" + a + " : " + (!a));


	}
}