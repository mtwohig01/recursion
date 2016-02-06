/* 
 * HDC - Data Structure and Algorithms
 * Exercise # 4
 * CodingBat.com - Recusion exercise
 * triangle:
 * Given a non-negative int n, return the sum of its digits
 * recursively (no loops). Note that mod (%) by 10 yields the
 * rightmost digit (126 % 10 is 6), while divide (/) by 10
 * removes the rightmost digit (126 / 10 is 12). .

 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 *
 * Michael Twohig
 * 2016-02-05
 *
 */




public class SumDigits {
	public static void main (String [] args) {
		int i;
		i=126;
		print(sigmaDigits(i));
		i=49;
		print(sigmaDigits(i));
		i=12;
		print(sigmaDigits(i));
	}

	private static int sigmaDigits(int n){ 
		if (n == 0)
			return 0;
		else
			return n%10 + sigmaDigits(n/10);
	}
	

	private static void print(String s){
		System.out.println(s);
	}

	private static void print(int n){
		System.out.println(n);
	}
}
