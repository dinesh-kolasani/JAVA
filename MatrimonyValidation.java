import java.util.Scanner;

public class MatrimonyValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input gender
        System.out.print("Enter your gender (Male/Female/Other): ");
        String gender = scanner.nextLine();

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
	// Input marital status
        System.out.print("Enter marital status (Single/Married/Divorced/Widowed): ");
        String maritalStatus = scanner.nextLine();

        // Input country
        System.out.print("Enter your country (India/USA/UK/Canada): ");
        String country = scanner.nextLine();
        
        // Validating gender
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")) {

            // Validating marital status
            if (maritalStatus.equalsIgnoreCase("Single") || maritalStatus.equalsIgnoreCase("Divorced")) {

                // Validating country
                if (country.equalsIgnoreCase("India") || country.equalsIgnoreCase("USA") || 
                    country.equalsIgnoreCase("UK") || country.equalsIgnoreCase("Canada")) {
                    
                    if (gender.equalsIgnoreCase("Male")) {
                        if (age >= 21) {
                            System.out.println("You are ELIGIBLE for marriage criteria!");
                        } else {
                            System.out.println("You are INELIGIBLE for marriage because Male candidates must be at least 21 years old.");
                        }
                    } 
                    else { // For Female/Other
                        if (age >= 18) {
                            System.out.println("You are ELIGIBLE for marriage criteria!");
                        } else {
                            System.out.println("You are INELIGIBLE for marriage criteria, because Female/Other candidates must be at least 18 years old.");
                        }
                    }
                    
                } else {
                    System.out.println("You are INELIGIBLE for marriage criteria!. Because currently we only process applications from India, USA, UK, and Canada.");
                }
                
            } else {
                System.out.println("You are INELIGIBLE for marriage criteria!. You must be Single or Divorced to register.");
            }
            
        } else {
            System.out.println("INVALID INPUT entered. Please enter a valid gender (Male/Female/Other).");
        }
        
        scanner.close();
    }
}