package RuntimeExceptions;

public class NumberFormat {
	public static void main(String[] args) {
		System.out.println("Hello suresh");
		String name1="Hi";
		try {
			@SuppressWarnings("unused")
			int num=Integer.parseInt(name1);		
		}
		catch(NumberFormatException e) {
			System.out.println("Do not change String to Number");
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
