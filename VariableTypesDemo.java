public class VariableTypesDemo {

	// Instance variable
	int age;
	double salary;
	String name;

	// Static variable
    	static String companyName = "Surge";

	public static void main(String[] args) {
		
		// Local variable
        	String designation = "Developer";

		VariableTypesDemo emp1 = new VariableTypesDemo();
		emp1.age = 26;
		emp1.salary = 60000;
		emp1.name = "Dinesh";

		System.out.println("Employee Age: " + emp1.age);
		System.out.println("Employee Salary: " + emp1.salary);
		System.out.println("Employee Name: " + emp1.name);
		System.out.println("Company Name: " + emp1.companyName);
		System.out.println("Employee Designation: " + designation);


		VariableTypesDemo emp2 = new VariableTypesDemo();
		emp2.age = 28;
		emp2.salary = 80000;
		emp2.name = "Raj";

		System.out.println(emp2.name + " is a " + emp2.age + " years old. He was working as " + designation + " and earning " + emp2.salary + " at " + emp2.companyName);
	}
}