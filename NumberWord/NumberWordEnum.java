package dailyProblems.NumberWord;

public class NumberWordEnum {
		 

	public static void main(String[] args) {

		String z = "";
		switch (1) {
		case 1:
			z = EnumCall.ONE.toString();
			break;
		case 2:
			z = EnumCall.TWO.toString();
			break;
		case 3:
			z = EnumCall.THREE.toString();
			break;
		case 4:
			z = EnumCall.FOUR.toString();
			break;
		case 5:
			z = EnumCall.FIVE.toString();
			break;
		case 6:
			z = EnumCall.SIX.toString();
			break;
		case 7:
			z = EnumCall.SEVEN.toString();
			break;
		case 8:
			z = EnumCall.EIGHT.toString();
			break;
		case 9:
			z = EnumCall.NINE.toString();
			break;
		default:
			System.err.println("Other Number outside of 1-9");
			break;
		}
		System.out.println(z);
	}

}


	
	
	
	
	
	