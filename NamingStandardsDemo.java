public class NamingStandardsDemo {

	String COMPANY_NAME = "SURGE";
	String employeeName;
	int employeeID;
	double salary;

	public EmployeeInfo(String name, int id, double salary) {
		this.employeeName = name;
        	this.employeeID = id;
        	this.salary = salary;
    	}

	public void employeeDetails() {
		System.out.println("Company Name: " + COMPANY_NAME);
        	System.out.println("Employee ID: " + employeeID);
        	System.out.println("Employee Name: " + employeeName);
        	System.out.println("Employee Salary: " + salary);
	}
	
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo("dinesh", 777, 75000);
		emp1.employeeDetails();
	}
}