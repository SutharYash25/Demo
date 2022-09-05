/*Write a Java program to increase the size of an array list.*/

package first2;

import java.util.ArrayList;

public class Increasethesizeofarraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
          list.add("Yash");
  	      list.add("Nirav");
	      list.add("Jeet");
	      list.add("Deep");
	      
	      System.out.println(list);
	      list.ensureCapacity(3);
	      
	      list.add("Lalit");
	      list.add("Suthar");
	      list.add("Dhananjay");
	     
	      System.out.println(list);
	}

}
