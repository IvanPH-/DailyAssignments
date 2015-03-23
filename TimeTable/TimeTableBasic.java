package dailyProblems.TimeTable;

public class TimeTableBasic {
/* TimeTable : Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown below:

  * |  1  2  3  4  5  6  7  8  9
-------------------------------
 1 |  1  2  3  4  5  6  7  8  9
 2 |  2  4  6  8 10 12 14 16 18
 3 |  3  6  9 12 15 18 21 24 27
 4 |  4  8 12 16 20 24 28 32 36
 5 |  5 10 15 20 25 30 35 40 45
 6 |  6 12 18 24 30 36 42 48 54
 7 |  7 14 21 28 35 42 49 56 63
 8 |  8 16 24 32 40 48 56 64 72
 9 |  9 18 27 36 45 54 63 72 81
 

Challenge

-       Use interface with one method called “compute()” that takes 1 argument

-       Argument tells the computation type (addition, subtraction, multiplication, division)

-       Program should output the appropriate result based on the computation type

-       DO NOT USE IF…ELSE for checking the computation type in the implementation classes

-       Use separation of responsibilities and different classes including for the main application.
*/
	
	private void printTable(int x, String y) {
		System.out.print("* |");
		for(int i = 1; i <= x; i++) {
			System.out.print("\t" + i);
		}
		System.out.print("\n ----------------------------------------------------------------------------");
		for(int j = 1; j <= x; j++) {
			System.out.print("\n" + j + "|");
			for (int k = 1; k <= x; k++) {
				System.out.print("\t" + (j * k));
			}
		}
	}
	public static void main(String[] args) {
		TimeTableBasic table = new TimeTableBasic();
		table.printTable(9, "multiply");
	}
}
