/*
 * Exercise 8: Create a method that accepts a String and checks if it is a
 * positive string. A string is considered a positive string, if on moving from
 * left to right each character in the String comes after the previous characters
 * in the Alphabetical order. For Example: ANT is a positive String(Since T comes
 * after N and N comes after A). The method should return true if the entered 
 * string is positive.
 */
package lab3;
import java.util.Scanner;
public class Exercise6 {

	
		   static boolean alphabetical_order(String my_str){
		      int str_len = my_str.length();
		      for (int i = 1; i < str_len; i++){
		         if (my_str.charAt(i) < my_str.charAt(i - 1)){
		            return false;
		         }
		      }
		      return true;
		   }
		   static public void main(String[] args){
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter any String");
			   String my_str=sc.next();
	  
			   
		      if (alphabetical_order(my_str)){
		         System.out.println("The letters are in alphabetical order.");
		      } else{
		         System.out.println("The letters are not in alphabetical order.");
		      }
		   }
		
}
