package dailyProblems.SumAndAve;

public class SumAndAverageStandAlone {
	public static void main(String[] args) {
	getSum(1, 100);
	}
	public static void getSum(int x, int y) {
		int sum, evenSum, oddSum;
		sum = y * (y + x) / 2;
		evenSum = (y / 2) * (y + (x + 1)) / 2;
		oddSum = (y / 2) * (y - 1 + (x)) / 2;
		double avg, evenAvg, oddAvg;
		avg = sum / (double) y;
		evenAvg = evenSum / 50;
		oddAvg = oddSum / 50;
		System.out.println(sum + " " + evenSum + " " + oddSum);
		System.out.print(avg + " " + evenAvg + " " + oddAvg);
	}
}
