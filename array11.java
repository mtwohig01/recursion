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


// Given an array of ints, compute recursively the number of times that
// the value 11 appears in the array. We'll use the convention of considering
// only the part of the array that begins at the given index.
// In this way, a recursive call can pass index+1 to move down the array.
// The initial call will pass in index as 0.

// array11({1, 2, 11}, 0) → 1
// array11({11, 11}, 0) → 2
// array11({1, 2, 3, 4}, 0) → 0


public class array11 {
    public static void main (String [] args) {
    	int [] a = { 1 , 2 , 11};
    	int [] b = { 11 , 11};
    	int [] c = { 1 , 2 , 3 , 4 };
    	
		System.out.println(array11( a , 0)); // 1
		System.out.println(array11( b , 0)); // 2
		System.out.println(array11( c , 0)); // 0
    }

    /**
      * Recursive method to compute the number of occurances of an array
      * that contains the value 11
      *
      */

    private static int array11 (int [] nums, int index) {
		if (index == nums.length) {
			return 0;
		}
		else{
			if (nums[index] == 11){
				
				return 1 + array11(nums,index+1);
			}
			else {
				return array11(nums,index+1);
			}
		}
    }
}