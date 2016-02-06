/*
* count7.java
* HDC - Griffith College Cork
* Mike Twohig
* 2014-02-07
*
*/

// Given a non-negative int n, return the count of the occurrences
// of 7 as a digit, so for example 717 yields 2. (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

// count7(717) → 2
// count7(7) → 1
// count7(123) → 0


public class count7 {
    public static void main (String [] args) {
	System.out.println(count(717));     // 2
	System.out.println(count(7));       // 1
	System.out.println(count(8));       // 0
	System.out.println(count(177));     // 2
	System.out.println(count(17770));   // 3
	System.out.println(count(77711));   // 3
	System.out.println(count(77777));   // 5
	System.out.println(count(7137707)); // 4

    }

    private static int count(int n) {
    	if (n%10==7)
    		return 1+count(n/10);
    	else if (n!=0)
    		return count(n/10);
    	else
    		return 0;
    }
}