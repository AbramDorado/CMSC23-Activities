public class Main {

	public static void main(String args[]) {
		try{
			System.out.println("Try block is executed\n");
			//will not throw exception 
			int num1 = 10/2; 
			System.out.println(num1);
			
			//may throw exception 
			int num2 = 10/0; 
			System.out.println(num2);
		}
		
		// handling the exception  
		catch(ArithmeticException e){
			System.out.println("\nCatch block is executed");
			System.out.println();
			System.out.println(e);
			System.out.println("[UNDEFINED] Can't divided by zero\n");
		}
		//finally block
		finally {
			System.out.println("Finally block is executed\n");
		}
		System.out.println("rest of the code");
	}
}