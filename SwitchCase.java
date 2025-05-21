import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Month Value (1 to 12): ");
		int month = scanner.nextInt(); 

		String monthString="";

		switch(month) {  
		 	 
		    case 1: 
		    	monthString = "Jan month";
		    	break;	
		    case 2:
		    	monthString = "Feb month";
		    	break;
		    case 3: 
		    	monthString = "March month";
		    	break;	    	
		    case 4:
		    	monthString = "April month";
		    	break;
		    case 5: 
		    	monthString = "May month";
		    	break;
		    case 6:
		    	monthString = "June month";
		    	break; 	
		    case 7: 
		    	monthString = "July month";
		    	break;    	
		    case 8:
		    	monthString = "August month";
		    	break;
		    case 9: 
		    	monthString = "Sep month";
		    	break;	
		    case 10:
		    	monthString = "Oct month";
		    	break;
		    case 11: 
		    	monthString = "Nov month";
		    	break;	
		    case 12:
		    	monthString = "Dec month";
		    	break;
		    default: 
		    	monthString = "Invalid month";
		    	break;
		    
		    	}
		System.out.println("Your choosing " + monthString);
	}	
} 