/*
 * Exercise 2: Create a method that can accept an array of String objects
 * and sort in alphabetical order. The elements in the left half should be
 * completely in uppercase and the elements in the right half should be completely
 *  in lower case. Return the resulting array.
 *  Note: If there are odd number of String objects, then (n/2) +1 elements should be
   in UPPPERCASE

 */
package lab2;
import java.util.Arrays;  
import java.util.Scanner;

public class Exercise2 {
	  
	   public static void main(String args[])   
	   {  
	      Scanner sc=new Scanner(System.in);
	      Scanner sc1=new Scanner(System.in);

	      int n;    //Declare array size
	      System.out.println("Enter the number of elements ");
	      n=sc.nextInt();     

	      String str[]=new String[n];   
	      System.out.println("Enter the String ");
	      for(int i=0; i<n ;i++)     
	      {
	          str[i]=sc1.nextLine();
	      }

	      Arrays.sort(str);    //Sort the array in alphabetical order

	      System.out.println(Arrays.toString(str));  
	   }  
	

}
