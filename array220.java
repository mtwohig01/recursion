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


// Given an array of ints, compute recursively if the array contains
// somewhere a value followed in the array by that value times 10.
// We'll use the convention of considering only the part of the array
// that begins at the given index. In this way, a recursive call can pass index+1
// to move down the array. The initial call will pass in index as 0.

// array220({1, 2, 20}, 0) → true
// array220({3, 30}, 0) → true
// array220({3}, 0) → false


public class array220 {
    public static void main (String [] args) {
    	int [] a = { 1 , 2 , 20 };
    	int [] b = { 3 , 30 };
    	int [] c = { 3 };
    	
		System.out.println(array220( a , 0)); // true
		System.out.println(array220( b , 0)); // true
		System.out.println(array220( c , 0)); // false
    }

    /**
      * Recursive method to compute the number of occurances of an array
      * that contains the value 11
      *
      */

    private static boolean array220 (int [] nums, int index) {
		if (index >= nums.length-1) {
			return false;
		}
		else{
			if (nums[index+1] == 10 * nums[index]){
				
				return true;
			}
			else {
				return array220(nums,index+1);
			}
		}
    }
}