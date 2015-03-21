package dailyProblems.NumberWord;

public class NumberWordifStatement extends PrintNumberInWord {
	public NumberWordifStatement (int x, String y) {
		if (x == 0) {
			y = "Zero";
		}
		else if (x == 1) {
			y = "One";
		}
		else if (x == 2) {
			y = "Two";
		}
		else if (x == 3) {
			y = "Three";
		}
		else if (x == 4) {
			y = "Four";
		}
		else if (x == 5) {
			y = "Five";
		}
		else if (x == 6) {
			y = "Six";
		}
		else if (x == 7) {
			y = "Seven";
		}
		else if (x == 8) {
			y = "Eight";
		}
		else if (x == 9) {
			y = "Nine";
		}
		else {
			y = "Outside of 1 - 9 bounds";
		}
		System.out.println("Number is " + x + " and its string is " + y);
	}
}
