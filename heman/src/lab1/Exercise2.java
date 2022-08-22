/*
 *Exercise 2: Write a java program that simulates a traffic light. 
 *The program lets the user select one of three lights: red, yellow, or green
 *with radio buttons. On entering the choice, an appropriate message
 *with “stop” or “ready” or “go” should appear in the console .
 *Initially there is no message shown
 */

package lab1;
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose Any one");
		System.out.println("1.RED  2.YELLOW  3.GREEN");
		int number=scan.nextInt();
		//int input=scan.nextInt();
		switch (number) {
		
		case 1:
			System.out.println("STOP");
			break;
			
		case 2: 
			System.out.println("READY");
			break;
			
		case 3:
			System.out.println("GO");
			break;
			
		default: 
			System.out.println("Invalid number");
		
		}

	}

}
