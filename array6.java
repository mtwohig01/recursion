/*
 *
 * HDC - Griffith College Cork
 * Object Orientated Design
 * Data Structures
 * HCI and GUI Programming
 *
 * Mike Twohig
 * 2016-02-07
 *
 */


// Given an array of ints, compute recursively if the array contains a 6.
// We'll use the convention of considering only the part of the array that
// begins at the given index. In this way, a recursive call can pass index+1
// to move down the array. The initial call will pass in index as 0.

// array6({1, 6, 4}, 0) → true
// array6({1, 4}, 0) → false
// array6({6}, 0) → true


public class array6 {
    public static void main (String [] args) {
    	int [] a = { 1 , 6 , 4};
    	int [] b = { 1 , 4};
    	int [] c = { 6 };
    	
		System.out.println(array6( a , 0)); // true
		System.out.println(array6( b , 0)); // false
		System.out.println(array6( c , 0)); // true
    }

    /** Recursive method to compute it an array contains the value 6
    */
    private static boolean array6 (int [] a, int i) {
		if (i == a.length) {
			return false;
		}
		else{
			if (a[i] == 6){
				return true;
			}
			else {
				return array6(a,i+1);
			}
		}
    }
}