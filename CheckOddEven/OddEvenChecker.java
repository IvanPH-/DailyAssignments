package dailyProblems.CheckOddEven;

public class OddEvenChecker {
	public static void main(String[] args) {
		printOddEven(0, 100);
	}
	public static void printOddEven(int x, int y) {
		for(int i = x; i < y; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number");
			}
			else if (i % 2 != 0) {
				System.out.println("Odd Number");
			}
		}
	}
}
