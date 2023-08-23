package ComplieTimeExceptions;

public class multipleCatch {
	public static void main(String[] args) {
		String[] val= {"raja","ravi"};
		try {
			System.out.println(val[7]);
			System.out.println(val[0].charAt(7));
		}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("String Exceed Length");
			a.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Array bound");
			b.printStackTrace();
			
		}
		catch(NullPointerException c) {
			System.out.println("NullPoint");
			c.printStackTrace();
		}
	}
}
