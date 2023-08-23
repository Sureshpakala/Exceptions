package ComplieTimeExceptions;

public class vote {
	public static void main(String[] args) throws InvalidAgeException {
		int age=18;
		if(age<18) {
			throw new InvalidAgeException("Not Eligibility age");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
}
