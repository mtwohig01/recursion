/* 
 * HDC - Data Structure and Algorithms
 * Exercise # 2
 * CodingBat.com - Recusion exercise
 * BunnyEars:
 * We have bunnies standing in a line, numbered 1, 2, ...
 * The odd bunnies (1, 3, ..) have the normal 2 ears.
 * The even bunnies (2, 4, ..) we'll say have 3 ears,
 * because they each have a raised foot. Recursively return the
 * number of "ears" in the bunny line 1, 2, ... n (without loops
 * or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
bunnyEars2(3) → 7
bunnyEars2(2) → 5
 *
 * Michael Twohig
 * 2016-02-05
 */




public class bunnyEars2 {
	public static void main (String [] args) {
	print("0: "  + bunny(0));  // 0
	print("1: "  + bunny(1));  // 2
	print("2: "  + bunny(2));  // 5
	print("3: "  + bunny(3));  // 7
	print("4: "  + bunny(4));  // 10
	print("5: "  + bunny(5));  // 12
	print("6: "  + bunny(6));  // 15
	print("10: " + bunny(10)); // 25
	
	}

	private static int bunny(int n){
		if (n == 0)
			return 0;
		else if (n == 1)
			return 2;
		else if (n%2==0)
			return 3 + bunny(n-1);
		else
			return 2 + bunny(n-1);
	}

	private static void print(String s){
		System.out.println(s);
	}

	private static void print(int n){
		System.out.println(n);
	}
}
