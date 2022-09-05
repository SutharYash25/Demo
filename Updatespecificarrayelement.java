/* Write a Java program to update specific array element by given element.
*/

package first2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Updatespecificarrayelement {
   public static void main(String[] args) {
	    List list = new ArrayList<>();
	      list.add("C");
	  	  list.add("c++");
		  list.add("HTML");
		  list.add("Python");
		  list.add("Java");
		  list.add("PHP");
		  
		  System.out.println(list);
		  list.set(3, "list");
		  System.out.println(list);
		  
		  Iterator it = list.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
  }
}
