/*
 *Exercise 3:  Create an Exception class named as “EmployeeException”
 *(User defined Exception) in a package named as “com.cg.eis.exception”
 * and throw an exception if salary of an employee is below than 3000.
 * Use Exception Handling mechanism to handle exception properly.
 */
package lab5;

import java.io.BufferedReader;
//import java.lang.NumberFormatException;
import java.io.InputStreamReader;

public class Exercise3 {

	public static void main(String[] args) throws NumberFormatException,Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Salary: ");
		int employeeSalary=Integer.parseInt(br.readLine());
		try {
		if(employeeSalary<3000) 
		{
			throw new NumberFormatException() ;
			//throw new IOException() ;
		}
		System.out.println("Alright");
			
		}
		catch(NumberFormatException a)
		{
			System.out.println("Your salary is less than 3000 "+a);
		}
		finally
		{
			br.close();
		}
		 
	}
}
