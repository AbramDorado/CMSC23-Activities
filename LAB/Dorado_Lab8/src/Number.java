import java.util.Scanner;

/**
 * <H2>CMSC 23 Lab1A - Activity #8</H2>
 * The use of Javadoc and Exceptions
 * @author Abram C. Dorado
 * @version 1.0 
 */

public class Number {
	/**
	 * <p>
	 * This method converts the input value that is a number
	 * into a phone number format - Example: (xxx) xxx-xxxx
	 * </p>
	 */
    public static void Converter(){
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("==Enter 10-digit phone number==");
			System.out.print("number: ");
			String input = scanner.next();

			if (input.length() != 10){
			    System.out.println("Pls only enter 10 digit number!\n");
			    Converter();
			}
			else if (!isNumeric(input)) {
				System.out.println("Pls enter numbers only!\n");
				Converter();
			}
			else {
			    // regex for sequence of digits ex: \\d+
			    String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
			    System.out.println("converted: " + number);

				System.out.println("Enter a number again? (y or n)\n");
				System.out.print("Answer: ");
				String answer = scanner.next();
				if (answer.equals("y"))
					Converter();
				else
					System.out.println("Exit Program...");
			}
		}
    }

	/**
	 * Auxiliary method checks if the input Sting is a number or not
	 * @exception NumberFormatException uses the number format exception
	 * @param input the String input and checks if it is a number digit
	 * @return boolean see if the String is numeric
	 */
    public static boolean isNumeric(String input) {
    	  try {  
    	    Double.parseDouble(input);
    	    return true;
    	  } catch(NumberFormatException e){  
    	    return false;  
    	  }  
	}

	/**
	 * The Main method that executes the program
	 * @param args needed for the main method
	 */
    public static void main(String[] args) {
        Converter();
    }
}