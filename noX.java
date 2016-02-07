/*
* noX.java
* HDC - Griffith College Cork
* Mike Twohig
* 2016-02-06
*
*/

// Given a string, compute recursively a new string where
// all the 'x' chars have been removed.

// noX("xaxb") → "ab"
// noX("abc") → "abc"
// noX("xx") → ""

public class noX {
    public static void main (String [] args) {
	System.out.println(noX("codex"));   // "code"
	System.out.println(noX("xxhixx"));  // "hi"
	System.out.println(noX("xhixhix")); // "hihi"
    }
    private static String noX(String str) {
    	int len = str.length();
    	String s = "";
    	if (str.length()==0)
    		return s;
    	if (str.charAt(0)=='x')
    		s = "";
    	else
    		s = s + str.charAt(0);

    	if (len==1) 
    		return s;
    	else
    		return s + noX(str.substring(1));
    }
}