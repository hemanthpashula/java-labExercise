/*
 * Exercise 3: Create a method which accepts an integer array,
 * reverse the numbers in the array and returns the resulting array in sorted order
 */
package lab2;

import java.util.Arrays;

public class Exercise3 {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 5, 3, 4};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }
        
        Arrays.sort(arr);
		System.out.print("\nAfter sorting the reverse order:\n");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");		
		}
    }  
}  