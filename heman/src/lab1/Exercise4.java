/*
 * Exercise 4: Write a Java program that prompts the user for an integer
 *  and then prints out all the prime numbers up to that Integer?
 */

package lab1;
import java.util.Scanner;
//import java.lang.ArithmeticException;
public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		int temp=0;
		
		for (int i=1; i<=number;i++) {
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
			else {
				temp=0;
			}
			
		}
			
			
		
		
	}
}
