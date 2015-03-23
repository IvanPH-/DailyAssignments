package dailyProblems.TimeTable;

public class ComputeCall implements TableCompute {

	@Override
	public void compute(int x, String y) {
		System.out.print("* |");
		for(int i = 1; i <= x; i++) {
			System.out.print("\t" + i);
		}
		System.out.print("\n ----------------------------------------------------------------------------");
		for(int j = 1; j <= x; j++) {
			System.out.print("\n" + j + "|");
			for (int k = 1; k <= x; k++) {
				System.out.print("\t" + getComputer(y, j, k));
			}
		}
	}

	public int getComputer(String y, int a, int b) {
			int c = 0;
			y = y.toLowerCase();
			switch(y) {
			case "addition":
				return a + b;
			case "subtraction":
				return a - b;
			case "multiply":
				return a * b;
			case "divide":
				return a / b;
			default:
				System.err.print("Please input addition, subtraction, multiply, or divide");
				System.exit(1);
				break;
			}
			return c;
		}
	
	public static void main(String[] args) {
		ComputeCall table = new ComputeCall();
		table.compute(9, "multiply");
	}
}

	