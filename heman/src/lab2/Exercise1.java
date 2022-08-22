/*
 * Exercise 1: Create a method which accepts an array of integer elements
 *  		   and return the second smallest element in the array
 */
package lab2;

import java.util.Arrays;

public class Exercise1 {
	
	public static void main(String[] args) {
		int[] arr= {2,64,4,32,21,43,23,99};
		Arrays.sort(arr);
		System.out.print("Array in sorting order\n");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+"Second number after sorting an array is: "+arr[1]);
	}
	
	

}
