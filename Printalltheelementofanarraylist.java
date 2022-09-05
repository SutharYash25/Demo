/* Write a Java program to print all the elements of an ArrayList using the 
position of the elements.*/

package first2;

import java.util.ArrayList;

public class Printalltheelementofanarraylist {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();
          list.add("C");
	      list.add("C++");
	      list.add("Java");
	      list.add("Python");
	      
	      System.out.println(list);
	      int l1 = list.size();
	      
	      for(int i=0;i<l1;i++)
	      {
	    	  System.out.println(list.get(3));
	      }
	      
	}
}
