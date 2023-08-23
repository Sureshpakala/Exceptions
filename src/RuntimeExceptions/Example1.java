package RuntimeExceptions;

public class Example1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a=10;
		int b=0;
		try {
			@SuppressWarnings("unused")
			int c=a/b;			
		}
		catch(ArithmeticException ae) {
			System.out.println("we can't divide numbers using Zero");
			ae.printStackTrace();
		}
		finally {
			System.out.println("Thank You");
		}
		
		
		
		
		//String EXception......
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
		
		
		
		//NumberFormat Exception......
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
		
		
		
		//StringIndexBound Exception.........
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
		
		//ArrayIndexOutOfBound Exception........
		
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
