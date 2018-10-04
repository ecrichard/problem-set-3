/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
			ProblemSet3 ps3 = new ProblemSet3();
			ps3.dateFashion(5, 5);
			ps3.fizzString("fib");
			ps3.squirrelPlay(95, true);
			ps3.fizzStringAgain(3);
			ps3.makeBricks(3, 2, 8);
			ps3.loneSum(1, 2, 3);
			ps3.luckySum(13, 13, 3);
			ps3.factorialWithFor(5);
			ps3.factorialWithWhile(5);
			ps3.isPrime(191);
	}
		
	public void dateFashion(int you, int date) { 
		if ((you >= 8 && date > 2) || (date >= 8 && you > 2)) {
			System.out.println("YES");
		}
		else if((you >= 8 && date <= 2)||(date >= 8 && you <= 2))  {
			System.out.println("NO");
		}
		else {
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		if (str.charAt(0) =='f' && str.charAt(str.length()-1)!= 'b') {
			System.out.println("FIZZ");
		}
		else if(str.charAt(str.length()-1) == 'b' && str.charAt(0)!= 'f') {
			System.out.println("BUZZ");
		}
		else if (str.charAt(0) == 'f' && str.charAt(str.length()-1)== 'b') {
			System.out.println("FIZZBUZZ");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (temp <= 90 && temp >= 60) {
			System.out.println("YES");
		}
		else if (isSummer == true && temp <= 100) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 != 0 && n % 5 != 0) {
			System.out.print(n);
		}
		if (n % 3 == 0) {
			System.out.print("FIZZ");
		}
		if (n % 5 == 0) {
			System.out.print("BUZZ");
		}
		System.out.println("!");
	}
	
	public void makeBricks(int small, int big, int goal) {
		if(goal <= (big * 5)+ small ) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a != b && a != c && b != c) {
			System.out.println(a + b + c);
		}
		else if (a != b && a != c && b == c) {
			System.out.println(a);
		}
		else if (a != b && a == c && b != c) {
			System.out.println(b);
		}
		else if (a == b && a != c && b != c) {
			System.out.println(c);
		}
		else {
			System.out.println(0);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if (a == 13) {
			System.out.println(0);
		}
		else if (b == 13) {
			System.out.println(a);
		}
		else if (c == 13) {
			System.out.println(a + b);
		}
		else {
			System.out.println(a + b + c);
		}
	}
	
	public void factorialWithFor(int n) {
		int i = n;
		for (int x = n - 1; x > 1; x--) {
			n = n * x;
		}
		System.out.println(i + "! = " + n);
	}
	
	public void factorialWithWhile(int n) {
		int i = n;
		int x = n - 1;
		while (x > 1) {
			n = n * x;
			x--;
		}
		System.out.println(i + "! = " + n);
	}
	
	public void isPrime(int n) {
		int s = 0;
		if(n == 1) {
			System.out.println("NOT PRIME");
		}
		else if(n == 2) {
			System.out.println("PRIME");
		}
		else {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					i = n;
					s = 3;
				}
			}
			if (s == 3) {
				System.out.println("NOT PRIME");
			}
			else {
				System.out.println("PRIME");
			}
			
		}
	}
}