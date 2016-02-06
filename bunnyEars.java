/* 
 * HDC - Data Structure and Algorithms
 * Exercise # 5
 * CodingBat.com - Recusion exercise
 * bunnyEars:
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies
 * recursively (without loops or multiplication).

 * bunnyEars(0) → 0
 * bunnyEars(1) → 2
 * bunnyEars(2) → 4
 *
 * Michael Twohig
 * 2016-02-05
 *
 */


public class bunnyEars {
	public static void main (String [] args) {
		int i;
		print(bunny(0)); // 0
		print(bunny(1)); // 2
		print(bunny(2)); // 4
	}

	private static int bunny(int n){ 
		if (n == 0)
			return 0;
		else
			return 2 + bunny(n-1) ; // return the previous
									// number of bunnies and 2 more ears
	}
	

	private static void print(String s){
		System.out.println(s);
	}

	private static void print(int n){
		System.out.println(n);
	}
}
