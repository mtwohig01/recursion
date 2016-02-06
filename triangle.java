/* 
 * HDC - Data Structure and Algorithms
 * Exercise # 3
 * CodingBat.com - Recusion exercise
 * triangle:
 * We have triangle made of blocks.
 * The topmost row has 1 block, the next row down has 2 blocks,
 * the next row has 3 blocks, and so on.
 * Compute recursively (no loops or multiplication) the total
 * number of blocks in such a triangle with the given number of rows.

 * triangle(0) → 0
 * triangle(1) → 1
 * triangle(2) → 3
 * 
 * triangle(3) → 6
 * triangle(3) → 10
 * Michael Twohig
 * 2016-02-05
 */


public class triangle {
	public static void main (String [] args) {
	
	for (int i =0 ; i< 5; i++)
		print(i  + tri(i));
	
	}

	private static int tri(int rows){ 
		if (rows == 0)
			return 0;
		else if (rows == 1)
			return 1;
		else
			return rows + tri(rows-1);
	}

	private static void print(String s){
		System.out.println(s);
	}

	private static void print(int n){
		System.out.println(n);
	}
}
