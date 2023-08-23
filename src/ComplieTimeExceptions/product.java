package ComplieTimeExceptions;

public class product {
	public static void main(String[] args) throws InvalidProductException {
		int price=2000;
		if(price<15000) {
			throw new InvalidProductException("Product was not Purchased");
		}
		else {
			System.out.println("Product Purchased");
		}
	}
}
