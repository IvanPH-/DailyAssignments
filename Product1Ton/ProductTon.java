package dailyProblems.Product1Ton;

public class ProductTon {
	public static void main(String args[]) {
		findProduct(1, 11);
	}
	
	private static long findProduct(int x, int y) {
		long product = x;
		for(int i = x; i <= y; i++) {
			product *= i;
		}
		System.out.print("The product is: " + product);
		return product;
	}
}
