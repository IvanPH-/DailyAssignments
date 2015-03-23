package dailyProblems.SquareBoard;

public class SBInterfaceImplement2 implements SquareBoardInterface {

	@Override
	public void square(int x, String y) {
		y = y.toLowerCase();
		print(x, y); //Add a try catch block here
	}
	
	public void print(int x, String y) {
		int generate = x * x;
		boolean checkeredFlag = false;
		for (int i = 1; i <= generate; i++) {
			System.out.print("# ");
			if (y == "normal") {
				if (i % x == 0) {
					System.out.println();
				}
			}
			else if (y == "checkered") {
				if (i % x == 0 && checkeredFlag == false) {
					checkeredFlag = true;
					System.out.print("\n ");
				}
				else if (i % x == 0 && checkeredFlag == true) {
					checkeredFlag = false;
					System.out.print("\n");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SBInterfaceImplement2 draw = new SBInterfaceImplement2();
		draw.square(9, "checkered");
	}
}

