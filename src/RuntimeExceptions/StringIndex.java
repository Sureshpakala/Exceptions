package RuntimeExceptions;

public class StringIndex {
	public static void main(String[] args) {
		System.out.println("Hello suresh");
		String name2="suresh";
		try {
			System.out.println(name2.charAt(8));		
		}
		catch(StringIndexOutOfBoundsException ak) {
			System.out.println("Index Out Bound");
			ak.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
