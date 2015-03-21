package dailyProblems.SumAndAve;

public class SumAndAverageBasic {
	public static void main(String args[]) {
		returnSumAve(1, 100);
	}
	
	private static void returnSumAve(int x, int y) {
		int sum = y*(y + x) / 2;
		double ave;
		//for(int i = x; i <= y; i++) {
		//	sum += i;
		//}
		ave = sum / (double) y;
		System.out.println("The sum is: " + sum);
		System.out.println("The Average is: " + ave);
	}
}
