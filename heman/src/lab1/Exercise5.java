/*
 * Exercise 5: Create a class with a method which can calculate
 * the sum of first n natural numbers which are divisible by 3 or 5. 
 */
package lab1;
import java.util.Scanner;

public class Exercise5 {
	
	static int sum(int N,int x,int y) {
		int S1,S2,S3;

		 S1 = ((N / x)) * (2 * x + (N / x - 1) * x) / 2;
		 S2 = ((N / y)) * (2 * y + (N / y - 1) * y) / 2;
		 S3=  ((N/(x*y))) * (2 * x*y+(N/(x*y)-1) * (x*y))/2;
		 
		 return S1+S2-S3;	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any integer");
		int N=scan.nextInt();
		int x=3,y=5;
		
		System.out.print(sum(N,x,y));
		
	}
	
}