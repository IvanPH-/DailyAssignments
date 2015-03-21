package dailyProblems.NumberWord;

public class PrintNumberInWord implements NumberWordInterface {
	
	
	public static void main(String[] args) {
		PrintNumberInWord Answer = new PrintNumberInWord();
		Answer.intToNumb(8);
		Answer.stringNumb();
		
		PrintNumberInWord anotherTest = new PrintNumberInWord(); 
		anotherTest.intToNumb(11);
		anotherTest.stringNumb();
		
		NumberWordifStatement test2 = new NumberWordifStatement(5, "");
		NumberWordifStatement test3 = new NumberWordifStatement(11, "");
		
		NumberWordSwitchStatement test4 = new NumberWordSwitchStatement(11, "");
		NumberWordSwitchStatement test5 = new NumberWordSwitchStatement(2, "");
		
	}
	
	String result;
	int x;

	@Override
	public void stringNumb() {
			System.out.println("The number was " + this.x + " and its string is " + this.result);
	}

	@Override
	public void intToNumb(int x) {
		this.x = x;
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
			
			
		}
		
	}
