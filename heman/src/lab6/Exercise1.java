package lab6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise1 {

	public static void main(String args[]) throws ParseException { 
		
		HashMap<String, String> codenames = new HashMap<String, String>(); 
		codenames.put("Student1", "Hemanth");
		codenames.put("Student2", "Anurag");
		codenames.put("Student3", "Vamshi");
		codenames.put("Student4", "Dinesh");
		codenames.put("Student5", "Zeeshan");
		codenames.put("Student8", "Harshith"); 
		codenames.put("Student7", "Akhil");
		
		 Set<Entry<String, String>> entries = codenames.entrySet();
		
		// sorting the HashMap by values 
		Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
			@Override 
			public int compare(Entry<String, String> e1, Entry<String, String> e2) 
			{
				String v1 = e1.getValue();
				String v2 = e2.getValue();
				return v1.compareTo(v2); 
				} 
			};
			
			
			// converting Set to List in Java 
			
			List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries);
			
			// sorting HashMap by values using comparator 
			
			Collections.sort(listOfEntries, valueComparator);
			LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
			
			for(Entry<String, String> entry : listOfEntries)
			{
				sortedByValue.put(entry.getKey(), entry.getValue()); 
				} 
			System.out.println("HashMap after sorting entries by values ");
			
			Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet(); 
			for(Entry<String, String> mapping : entrySetSortedByValue)
			{
				System.out.println(mapping.getKey() + " : " + mapping.getValue());
			}

		
	}

		
}
