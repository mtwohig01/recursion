/*
* changeXY.java
* HDC - Griffith College Cork
* Mike Twohig
* 2016-02-06
*
*/

// Given a string, compute recursively (no loops) a new string
// where all the lowercase 'x' chars have been changed to 'y' chars.

// changeXY("codex") → "codey"
// changeXY("xxhixx") → "yyhiyy"
// changeXY("xhixhix") → "yhiyhiy"

public class changeXY {
    public static void main (String [] args) {
	System.out.println(changeXY("codex"));   // "codey"
	System.out.println(changeXY("xxhixx"));  // "yyhiyy"
	System.out.println(changeXY("xhixhix")); // "yhiyhiy"
    }
    private static String changeXY(String str) {
    	int len = str.length();
    	String s = "";
    	if (str.length()==0)
    		return s;
    	// System.out.println(str);
    	if (str.charAt(0)=='x')
    		s = "y";
    	else
    		s = s + str.charAt(0);

    	if (len==1) 
    		return s;
    	else
    		return s + changeXY(str.substring(1));
    }
}