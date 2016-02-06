/*
* fibonacci.java
* The fibonacci sequence is a famous bit of mathematics,
* and it happens to have a recursive definition.
* The first two values in the sequence are 0 and 1
* (essentially 2 base cases). Each subsequent value is the
* sum of the previous two values, so the whole sequence is:
* 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive
* fibonacci(n) method that returns the nth fibonacci number,
* with n=0 representing the start of the sequence.
*
* fibonacci(0) → 0
* fibonacci(1) → 1
* fibonacci(2) → 1
*
* HDC - Griffith College Cork
* Mike Twohig
* 2014-02-07
*
*/

public class fibonacci {
    public static void main (String [] args) {
    	System.out.println(fib(0));
    	System.out.println(fib(1));
    	System.out.println(fib(2));
    	System.out.println(fib(3));
    	System.out.println(fib(4));
    	System.out.println(fib(5));
    	System.out.println(fib(6));
    	System.out.println(fib(7));
    	System.out.println(fib(8));
    	System.out.println(fib(9));
    }

    private static int fib (int n) {
    	if (n < 2)
    		return n;
    	else
    		return fib(n-1)+fib(n-2);
    }
}