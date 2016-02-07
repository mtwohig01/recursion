/*
* powerN.java
* HDC - Griffith College Cork
* Mike Twohig
* 2014-02-07
*
*/

// Given base and n that are both 1 or more, compute
// recursively (no loops) the value of base to the n power,
// so powerN(3, 2) is 9 (3 squared).

// powerN(3, 1) → 3
// powerN(3, 2) → 9
// powerN(3, 3) → 27


public class powerN {

    public static void main (String [] args) {
	System.out.println(power(3,1));     // 3
	System.out.println(power(3,2));     // 9
	System.out.println(power(3,3));    // 27
    }

    private static int power(int n, int p) {
        if (p==1)
    		return n;
        else
            return n*power(n,p-1);
    }
}