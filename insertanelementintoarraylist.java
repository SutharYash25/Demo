/* Write a Java program to insert an element into the array list at the first 
position.*/

package first2;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class insertanelementintoarraylist {
    public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("C");
		list.add("c++");
		list.add("HTML");
		list.add("Python");
		list.add("Java");
		list.add("PHP");
		
        System.out.println(list);
        list.add(0,"PHP");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext());
        {
        	System.out.println(it.next());
        }
		
	}
}
