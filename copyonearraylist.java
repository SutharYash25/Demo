/* Write a Java program to copy one array list into another*/

package first2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyonearraylist {
   public static void main(String[] args) {
	
	   List list = new ArrayList<>();
	      list.add(1);
	  	  list.add(2);
		  list.add(3);
		  list.add(4);
		  list.add(5);
		  list.add(6);
		  list.add(7);
		  System.out.println("first list"+list);
		  
		  List list1 = new ArrayList<>();
		  list1.add(8);
		  list1.add(9);
		  list1.add(10);
		  
		  System.out.println("Second list"+list);
		  Collections.copy(list, list1);
		  System.out.println("First list after copy:"+list);
		  
	}
}
