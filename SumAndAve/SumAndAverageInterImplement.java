package dailyProblems.SumAndAve;

import java.util.ArrayList;
import java.util.List;

public class SumAndAverageInterImplement implements SumAndAverageInterface {
	//While and if statements in a method to get these
	//	SumAndAverage: Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100). Also compute and display the average. The output shall look like:The sum is 5050The average is 50.5
	//Challenge
	//-       Use interface with 3 methods one for sum and one for average, one for printing.
	//-       Define max upper bound and min lower bounds as constants
	//-       Add method to do the sum and average of only odd numbers between the range
	//-       Add method to do the sum and average of only even numbers between the range
	//-       Use a stand alone application class that can run the above scenarios. This class should not have any implementations.
	//-       DO NOT use a for loop
	int sum, oddSum, evenSum = 0;
	double avg, oddAvg, evenAvg = 0;
	
	@Override
	public void getSum(int x, int y) {
		sum = y*(y + x)/ 2;
		avg = sum /(double) y;
		getOtherSumAvg(x, y);
		prints(sum, oddSum, evenSum, avg, oddAvg, evenAvg);
		}

	@Override
	public void getOtherSumAvg(int x, int y) {
		int placeHold = x;
		List<Integer> evenNum = new ArrayList<Integer>();
		List<Integer> oddNum = new ArrayList<Integer>();
		while (x <= y) {
			if (x == 0) {
				continue;
			}
			else if (x % 2 == 0) {
				evenNum.add(x);
			}
			else if (x % 2 != 0) {
				oddNum.add(x);
			}
			x++;
		}
		int a = evenNum.size();
		int b = oddNum.size();
		evenSum = a*(evenNum.get(a - 1) + placeHold + 1) / 2;
		evenAvg = evenSum /(double) a;
		oddSum = b*(oddNum.get(b - 1) + placeHold) / 2;
		oddAvg = oddSum /(double) b;
	}

	@Override
	public void prints(int x, int y, int z, double a, double b, double c) {
		System.out.println("The sum is: " + x + "\n The sum for odd numbers is: " + y + "\n The sum for even numbers is: " + z);
		System.out.print("The average is: " + a + "\n While the average for odd numbers is: " + b + "\n The Average for the even numbers is: " + c);
	}
	public static void main(String[] args) {
		SumAndAverageInterImplement test = new SumAndAverageInterImplement();
		test.getSum(1, 100);
		}
}