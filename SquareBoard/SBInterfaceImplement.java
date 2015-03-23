package dailyProblems.SquareBoard;

public class SBInterfaceImplement implements SquareBoardInterface {

	@Override
	public void square(int x, String y) {
		int generate = x * x;
		y = y.toLowerCase();
		switch(y) {
		case "normal":
			normal(x, generate);
			break;
		case "checkered":
			checkered(x, generate);
			break;
		default: 
			System.out.print("Not normal or checkered");
		}
	}
	
	public void normal(int x, int y) {
		for (int i = 1; i <= y; i++) {
			System.out.print("#");
			if (i % x == 0) {
				System.out.println();
			}
		}
	}
	
	public void checkered(int x, int y) {
		boolean checkeredFlag = false;
		for(int i = 1; i <= y; i++) {
			System.out.print("#");
			if (i % x == 0 && checkeredFlag == false) {
				System.out.print("\n ");
				checkeredFlag = true;
			}
			else if (i % x == 0 && checkeredFlag == true) {
				checkeredFlag = false;
				System.out.print("\n");
			}
		}
	}
	
	public static void main(String[] args) {
		SBInterfaceImplement draw = new SBInterfaceImplement();
		draw.square(7, "checkereD");
	}
}
