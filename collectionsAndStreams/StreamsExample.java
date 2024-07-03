package collectionsAndStreams;
import java.io.*;
import java.util.*;
public class StreamsExample {

	public static void main(String[] args) {
		
		        
		// Creating an empty ArrayList
        List<String> companyList = new ArrayList<>();
     
        // Adding elements to the ArrayList
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");
     
      
        
        // Sorting the list using sorted() method and printing the sorted list
        System.out.println("Sorted List:");
        companyList.stream().sorted().forEach(System.out::println);
        
        // Printing the original list
        System.out.println("\nOriginal List:");
        companyList.forEach(System.out::println);
		        
		        
		    }
		

	

}
