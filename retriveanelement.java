/* Write a Java program to retrieve an element (at a specified index) from a 
given array list.
*/

package first2;


import java.util.ArrayList;
import java.util.List;


public class retriveanelement {
    public static void main(String[] args) {
		
    	List list = new ArrayList<>();
    	list.add("C");
		list.add("c++");
		list.add("HTML");
		list.add("Python");
		list.add("Java");
		list.add("PHP");
		
		System.out.println(list);
		
		System.out.println(list.get(3));
	}
}
