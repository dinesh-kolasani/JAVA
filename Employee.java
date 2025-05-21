public class Employee {

	// Instance variable
	int age;
	double salary;
	String name;

	// Static variable
    	static String companyName = "Surge";

	// Constructor
	Employee(int inputAge, double inputSal, String givenName) {
		age = inputAge;
		salary = inputSal;
		name = givenName;
	}

	// Method without return values
	void printInfo() {

		// Local variable
        	String designation = "Developer";

		System.out.println("\nEmployee Age: " + age);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Designation: " + designation);
		System.out.println("Company Name: " + companyName);

	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(26,60000,"Dinesh");
		emp1.printInfo();


		Employee emp2 = new Employee(28, 80000, "Raj");
		emp2.printInfo();

	}
}