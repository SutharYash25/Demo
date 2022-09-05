/* Write a Java program to remove the third element from an array list.*/

package first2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class removethethirdelement {
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
		  Iterator it = list.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.println(i+":"+it.next());
			  i++;
		  }
		  list.remove(3);
		  System.out.println(list);
	}
}
