/* Write a Java program to search an element in an array list. */
package first2;

import java.util.ArrayList;
import java.util.List;

public class searchelementinarraylist {
    public static void main(String[] args) {
		
    	List list = new ArrayList<>();
	      list.add("C");
	  	  list.add("c++");
		  list.add("HTML");
		  list.add("Python");
		  list.add("Java");
		  list.add("PHP");
		  
		  int i=1;
		  System.out.println(list);
		  
		  if (list.contains("Android"))
		  {
			  System.out.println("Element in the list");
		  }
		  else
		  {
			  System.out.println("element is not in list");
		  }
	}
}
