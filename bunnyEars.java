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
		System.out.println( bunnyEars(0) ); // 0
		System.out.println( bunnyEars(1) ); // 2
		System.out.println( bunnyEars(2) ); // 4
		System.out.println( bunnyEars(-1) ); // -2
	}

	/**
	 *
	 * % Method Name : bunnyEars 
	 * Description : Count the number of ears for a given number of bunnies
	 *
	 * @param number of bunnies
	 * @return number of ears
	 *
	 */

	private static int bunnyEars(int n){ 
		if (n <= 0)
			return 0;
		else
			// return the previous number of bunnies ears plus 2 more ears.
			return 2 + bunnyEars(n-1) ;
	}
}
