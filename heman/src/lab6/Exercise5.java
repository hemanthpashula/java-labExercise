package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(23);
		values.add(32);
		values.add(12);
		values.add(45);
		values.add(34);
		
		System.out.print("After sorting: ");
		
		//Sorting Arraylist
		Collections.sort(values);
		
		for(int i : values)
		{
			System.out.print(i+ " ");
		}
		
		//To find the second smallest number
		int index1=values.get(1);
		System.out.println();
		System.out.println("\nSecond smallest number in arraylist: "+index1);
		//values.get(1);
	}
}
