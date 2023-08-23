package RuntimeExceptions;

public class ArrayIndex {
	public static void main(String[] args) {
		System.out.println("Hello suresh");
		int[] j= {5,3,6,8};
		try {
			System.out.println(j[7]);		
		}
		catch(StringIndexOutOfBoundsException m) {
			System.out.println("index are exceed than length");
			m.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
	}
}