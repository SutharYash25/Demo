/* Write a Java program to create a new array list, add some colours (string) 
and print out the collection.*/

package first2;

import java.util.ArrayList;
import java.util.List;


public class createnewarraylist {
     public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("black");
		list.add("Orange");
		list.add("Yellow");
		
		System.out.println(list);
	}
}
