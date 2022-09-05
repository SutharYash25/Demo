/* Write a Java program to shuffle elements in an array list.*/

package first2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffleelemntsinarraylist {
	public static void main(String[] args) {
		 List list = new ArrayList<>();
	      list.add(1);
	  	  list.add(2);
		  list.add(3);
		  list.add(4);
		  list.add(5);
		  list.add(6);
		  list.add(7);
		  list.add(8);
		  list.add(9);
		  list.add(10);
		  System.out.println("Original list"+list);
		  Collections.shuffle(list);
		  System.out.println("Shuffle list"+list);
	}

}
