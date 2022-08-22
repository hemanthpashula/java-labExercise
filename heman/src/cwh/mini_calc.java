package cwh;
import java.util.Scanner;
public class mini_calc {

	public static void main(String[] args) {
		//float num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		float number1=scan.nextFloat();
		System.out.println("Enter second number");
		float number2=scan.nextFloat();
		
		System.out.println("For adding number1 and number 2 Enter 0");
		System.out.println("For subtracting number1 and number 2 Enter 1");
		System.out.println("For multiplying number1 and number 2 Enter 2");
		System.out.println("For dividing number1 and number 2 Enter 3");
		
		int input=scan.nextInt();
		switch (input) {
		case 0: System.out.print("The result is: ");
				System.out.print(number1+number2);
				break;
				
		case 1: System.out.print("The result is: ");
				System.out.print(number1-number2);
				break;
				
		case 2: System.out.print("The result is: ");
				System.out.print(number1*number2);
				break;
				
		case 3: System.out.print("The result is: ");
				System.out.print(number1/number2);
				break;
				
		default:System.out.println("invalid number");
		}
	}
		
}
