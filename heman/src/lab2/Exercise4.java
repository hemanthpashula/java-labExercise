/*
 * Exercise 4: Create a method which accepts an integer array and removes 
 * all the duplicates in the array. Return the resulting array in descending order
 */
package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise4 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=scan1.nextInt();
			} 
			Arrays.sort(arr);
			System.out.print("After sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
			}
		int b=0;
		arr[b]=arr[0];
		System.out.print("\nAfter removing duplicate elements: ");
		for(int i=0;i<n;i++) {
			if(arr[b]!=arr[i]) {
				b++;
				arr[b]=arr[i];
			}
		}
			for(int i=0;i<=b;i++) {
			System.out.print(arr[i]+" ");
			}
		
		
	}

}
