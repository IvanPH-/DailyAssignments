package dailyProblems.NumberWord;

public class NumberWordSwitchStatement {
	public NumberWordSwitchStatement(int x, String result) {

	switch (x) {
	case 0: 
		result = "Zero";
		break;
	case 1:
		result = "One";
		break;
	case 2:
		result = "Two";
		break;
	case 3:
		result = "Three";
		break;
	case 4:
		result = "Four";
		break;
	case 5:
		result = "Five";
		break;
	case 6:
		result = "Six";
		break;
	case 7: 
		result = "Seven";
		break;
	case 8:
		result = "Eight";
		break;
	case 9:
		result = "Nine";
		break;
	default:
		result = "Other Number outside of 1-9";
		break;
}
	System.out.println("Number: " + x + " String: " + result);
}
}