/*  Write a Java program to sort a given array list */

package first2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class sortagivenarraylist {
	public static void main(String[] args) {
		List list = new ArrayList<>();
	      list.add("C");
	  	  list.add("c++");
		  list.add("HTML");
		  list.add("Python");
		  list.add("Java");
		  list.add("PHP");
		  
		  System.out.println("original list::"+list);
		  Collections.sort(list);
		  System.out.println(list);
		  
	}

}
