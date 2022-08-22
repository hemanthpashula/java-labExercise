/*
 * Exercise 6: Create a class with a method to find the difference
 *  between the sum of the squares and the square of the sum of the first n natural
 *  numbers.
 */
package lab1;

import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		int sum1=0,sum2=0;
		//int SqrOfAllNumbers=sum2*sum2;
		//int sqr=int i*i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print(i*i+" ");
			sum1=sum1+(i*i);
		}
			System.out.println("\nsum of Squares of numbers= "+sum1);
			
		for(int i=1;i<=number;i++) {
			sum2=sum2+i;
		}
			System.out.println("sum of numbers= "+sum2);
			System.out.println("Square of sum of the numbers= "+sum2*sum2);
			int sq=sum2*sum2;
			System.out.print("Difference of Sum of Squares of numbers and Square of Sum of the numbers= ");
			System.out.print(sum1-sq);
		
	}

}
