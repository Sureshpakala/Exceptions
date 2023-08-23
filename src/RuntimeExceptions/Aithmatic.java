package RuntimeExceptions;

public class Aithmatic {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a=10;
		int b=0;
		@SuppressWarnings("unused")
		int c;
		try {
			 c=a/b;			
		}
		catch(ArithmeticException ae) {
			System.out.println("we can't divide numbers using Zero");
			ae.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
