import java.io.*;

public class MarksValidationBR {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader BR = new BufferedReader(isr);
		
		System.out.print("Enter student marks (0-100): ");
		int marks = Integer.parseInt(BR.readLine());
		
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks! Marks must be between 0 and 100.");
		} else {
			System.out.print("Result: ");

			if (marks >= 90) {
				System.out.println("Grade: A");
			} else if (marks >= 80) {
				System.out.println("Grade: B");
			} else if (marks >= 70) {
				System.out.println("Grade: C");
			} else if (marks >= 60) {
				System.out.println("Grade: D");
			}  else if (marks >= 40) {
				System.out.println("Grade: E");
			} else {
				System.out.println("Fail in exams, study well.");
			}
		}
		BR.close();
	}
}