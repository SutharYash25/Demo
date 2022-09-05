/* Write a Java program to replace the second element of an ArrayList with 
the specified element. */

package first2;

import java.util.ArrayList;

public class replacethesecondelement {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();
          list.add("AA");
	      list.add("BB");
	      list.add("CC");
	      
	      System.out.println("Original list"+list);
	      
	      String s = "AA";
	      list.set(0, s);
	      System.out.println("Replace first element::"+list);
	}
}
