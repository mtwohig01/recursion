/*
* count8.java
* HDC - Griffith College Cork
* Mike Twohig
* 2014-02-07
*
*/


// Given a non-negative int n, compute recursively (no loops)
// the count of the occurrences of 8 as a digit, except that
// an 8 with another 8 immediately to its left counts double,
// so 8818 yields 4. Note that mod (%) by 10 yields the
// rightmost digit (126 % 10 is 6), while divide (/) by 10
// removes the rightmost digit (126 / 10 is 12).

// count8(8) → 1
// count8(818) → 2
// count8(8818) → 4


public class count8 {
    public static void main (String [] args) {
	System.out.println(count(818));     // 2
	System.out.println(count(8));       // 1
	System.out.println(count(8818));    // 4
    
    }

    private static int count(int n) {
        if (n%100==88)
    		return 2+count(n/10);
        else if (n%10==8) {
            return 1+count(n/10);
            }
    	else if (n!=0)
    		return count(n/10);
    	else
    		return 0;
    }
}