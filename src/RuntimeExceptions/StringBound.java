package RuntimeExceptions;

public class StringBound {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Hello suresh");
		String name=null;
		try {
			System.out.println(name.length());		
		}
		catch(NullPointerException k) {
			System.out.println("Its not a String");
			k.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
