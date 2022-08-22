/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule.
 * The first 2 values in the sequence are 1, 1.
 * Every subsequent value is the sum of the 2 values preceding it.
 * Write a Java program that uses both recursive and non-recursive
 * functions to print the nth value of the Fibonacci sequence?
 */

package lab1;
import java.util.Scanner;
public class Exercise3 {
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		int a=0,b=1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=number;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		//System.out.println(number);
		
		
		
	}

}
