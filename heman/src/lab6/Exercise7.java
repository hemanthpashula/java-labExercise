package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Exercise7 {
	
	// a reversed arraylist
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
    
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

	public static void main(String[] args) {
		
		Exercise7 obj = new Exercise7();
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(23);
		values.add(32);
		values.add(12);
		values.add(45);
		values.add(34);
		
		 System.out.print("Elements before reversing:");
	        obj.printElements(values);
	        values = obj.reverseArrayList(values);
	        System.out.print("\nElements after reversing:");
	        obj.printElements(values);
	        System.out.println();
	        
	        //sorting the elements
	        Collections.sort(values);
	        System.out.print("After sorting: ");
	        for(int i : values)
	        {
	        	System.out.print(i+" ");
	        }
	    }
	}