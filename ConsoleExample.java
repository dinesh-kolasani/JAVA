import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("No console available");
            System.exit(1);
        }
        
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
        
        System.out.println("Hello " + name);
        System.out.println("Your password is " + password.length + " characters long");
        
        // Clear the password from memory
        java.util.Arrays.fill(password, ' ');
    }
}