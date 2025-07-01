package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		//Challenges with Array
		
		String[] empNames2 = new String[3];
		empNames2[0] = "Alice";
		empNames2[1] = "Bob";
		empNames2[2] = "Charlie";
//		empNames2[3] = "Mamta";
		
//		1. Fixed Length
//		2. Memory allocation at the begining
//		3. similar data types
//		4. modifications not allowed
		
		
		//Collections
		
//		Hash ==> random
//		Link ==> Insertion
//		Tree ==> Ascending
		
		//List ==> ArrayList, LinkedList  (order of values or storing null values makes the difference or memory allocation)
//			1. List can store multiple values with similar data types together
//			2. List can store duplicate values
//			3. List can follow dynamic memory allocation
//			4. List can allow modifications
			
		//2. Set  ==> HashSet, LinkedHashSet, TreeSet
//			1. Set can store multiple values with similar data types together
//			2. Set cannot store duplicate values
//			3. Set can follow dynamic memory allocation
//			4. Set can allow modifications	
		
		//3. Map  ==> HashMap, LinkedHashMap, TreeMap, Hashtable
//			1. Map can store multiple datatypes together in the form of Key and Values
//			2. Map can store duplicate values but, duplicate keys are not allowed
//			3. Map can follow dynamic memory allocation
//			4. Map can allow modifications
		
	/******************************List- ArrayList********************************/
		//Syntax to initialize an ArrayList: List<DataType> listName = new ArrayList<DataType>();
		// Syntax to store values in an ArrayList: listName.add(value);
		// Syntax to retrieve values from an ArrayList: listName.get(index);
		// Syntax to remove values from an ArrayList: listName.remove(index);
		// Syntax to get the size of an ArrayList: listName.size();
		
		// ArrayList follows insertion order and allows duplicate values.
		
		System.out.println("**************List- ArrayList****************");
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("John");
		empNamesArrayList.add("Jane");
		empNamesArrayList.add("Doe");
		empNamesArrayList.add("Alice");
		empNamesArrayList.add("John");
		empNamesArrayList.add("Charlie");
		empNamesArrayList.remove("Alice");
		empNamesArrayList.add(null);
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(1));
		System.out.println(empNamesArrayList);
		
		/******************************List- LinkedList********************************/
		//Syntax to initialize an LinkedList: List<DataType> listName = new LinkedList<DataType>();
		// Syntax to store values in an LinkedList: listName.add(value);
		// Syntax to retrieve values from an LinkedList: listName.get(index);
		// Syntax to remove values from an LinkedList: listName.remove(index);
		// Syntax to get the size of an LinkedList: listName.size();
		
		// LinkedList follows insertion order and allows duplicate values.
		
		System.out.println("**************List- LinkedList****************");
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Jane");
		empNamesLinkedList.add("Doe");
		empNamesLinkedList.add("Alice");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Charlie");
		empNamesLinkedList.remove("Alice");
		empNamesLinkedList.add(null);
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(1));
		System.out.println(empNamesLinkedList);

	}

}
