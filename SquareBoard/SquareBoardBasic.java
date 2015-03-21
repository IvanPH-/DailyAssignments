package dailyProblems.SquareBoard;

public class SquareBoardBasic {
	public static void main(String[] args) {
		int square = 7;
		for (int i = 1; i <= square * square; i++) {
			System.out.print("# ");
			if (i % square == 0) {
				System.out.println();
			}
		}
	}
}
