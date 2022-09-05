/* Write a Java program to join two array lists.*/

package first2;

import java.util.ArrayList;

public class Jointwoarraylist {
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
  	      
  	    ArrayList<Integer> list1 = new ArrayList<>();
  	      list.add(11);
    	  list.add(12);
  	      list.add(13);
  	      list.add(14);
  	      list.add(15);
  	      list.add(16);
  	      list.add(17);
  	      list.add(18);
  	      list.add(19);
  	      list.add(20);
  	      
  	      ArrayList A = new ArrayList<>();
  	      A.addAll(list);
  	      A.addAll(list1);
  	      System.out.println(A);
	}
}
