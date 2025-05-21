import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your surname: ");
		String surName = input.nextLine();

		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		String fullName = surName + " " + name;

		System.out.print("Enter age: ");
		while (!input.hasNextInt()) {
    			System.out.println("Invalid input! Enter a number.");
   			input.next(); // Discard invalid input
		}
		int age = input.nextInt();

		System.out.print("Enter your salary: ");
        	double salary = input.nextDouble();
		
		System.out.println("Hello " + fullName + ", you are " + age + " years old and your salary is " + salary + ".");
		
		
	}
}