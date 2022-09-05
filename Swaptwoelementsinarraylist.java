/* Write a Java program of swap two elements in an array list.*/

package first2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swaptwoelementsinarraylist {
  public static void main(String[] args) {
	  ArrayList<Integer> list = new ArrayList<>();
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
	  
	  System.out.println(list);
	  
	  Collections.swap(list, 3, 8);
	  System.out.println(list);
   }
}
