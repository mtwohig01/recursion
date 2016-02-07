/*
*
* HDC - Griffith College Cork
* Object Orientated Design
* Data Structures
* HCI and GUI Programming
*
* Mike Twohig
* 2016-02-08
*
*/

// Given a string, compute recursively a new string where all the adjacent
// chars are now separated by a "*".

// allStar("hello") → "h*e*l*l*o"
// allStar("abc") → "a*b*c"
// allStar("ab") → "a*b"

public class allStar {
    public static void main (String [] args) {
		System.out.println(allStar("hello")); // "h*e*l*l*o"
		System.out.println(allStar("abc")); // "a*b*c"
		System.out.println(allStar("ab")); // "a*b"
    }

    private static String allStar (String str) {
    	int len = str.length();
    	if (len==0)
    		return "";
    	String star = str.charAt(0) + "*";
    	String nostar = str.charAt(0) + "";

    	if ( len == 1 ) {
    		return nostar;
   		}
    	else {
    		return star + allStar(str.substring(1));  
    	}
    }
}