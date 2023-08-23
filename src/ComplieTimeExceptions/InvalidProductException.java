package ComplieTimeExceptions;

@SuppressWarnings("serial")
public class InvalidProductException extends Exception {
	public InvalidProductException(String msg) {
		super(msg);
	}
}