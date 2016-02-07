/*
* countX.java
* HDC - Griffith College Cork
* Mike Twohig
* 2014-02-07
*
*/

// Given a string, compute recursively (no loops)
// the number of lowercase 'x' chars in the string.

// countX("xxhixx") → 4
// countX("xhixhix") → 3
// countX("hi") → 0



public class countX {

    public static int sumx=0;
    
    public static void main (String [] args) {
	System.out.println(count("xxhixx"));   // 4
	System.out.println(count("xhixhix"));  // 3
    System.out.println(count("hi"));  // 0
    System.out.println(count(""));  // 0
    System.out.println(count("xxx0x0xxxxxx"));  // 10

    }

    private static int count(String s) {
        if  ( s.length() == 0)
            return 0;
        else if  ( (s.length() != 1) && (s.charAt(0) == 'x') )
            return 1 + count( s.substring(1) );
        else if ( ( s.length() != 1 ) && ( s.charAt(0) != 'x') ) 
            return count( s.substring(1) );
        else if ( (s.length() == 1) && ( s.charAt(0) == 'x') )
            return 1;
        else
            return 0;
    } 
}