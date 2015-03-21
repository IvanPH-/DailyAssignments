package dailyProblems.CozaLozaWoza;

public class WhatIsFizzBuzzFor500 {
	public static void main(String[] args) {
		cozaWozaLoza(1, 110);
	}
	private static void cozaWozaLoza(int x, int y) {
		for(int i = x; i <= y; i++) {
			cozaLoza(i);
			if (i % 11 == 0) {
				System.out.print("\n");
			}
		}
	}
	
	private static void cozaLoza(int x) {
		if (x % 15 == 0) {
			System.out.print("CozaLoza ");
		} 
        else if (x % 5 == 0) {
            System.out.print("Loza ");
        }
        else if (x % 3 == 0) {
            System.out.print("Coza ");
        }
        else {
            System.out.print(x + " ");
        }
	}
}
