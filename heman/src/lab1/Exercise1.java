/* Exercise 1: Create a method to find the sum of the cubes of the digits
 *  of an n digit number
 */

package lab1;

import java.util.Scanner;

public class Exercise1{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=scan.nextInt();
		
		int sum=0;
		while(number>0) {
			int mod=number%10;//3
			sum=sum+(int)Math.pow(mod,3);
			number=number/10;//12
		}
		System.out.println(sum);
	}
}