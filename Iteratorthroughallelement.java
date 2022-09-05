/* Write a Java program to iterate through all elements in an array list.*/

package first2;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Iteratorthroughallelement {
     public static void main(String[] args) {
		List<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);
		List.add(8);
		List.add(9);
		List.add(10);
		
		System.out.println(List);
		Iterator<Integer> it = List.iterator();
		while(it.hasNext())
			{
			  System.out.println(it.next());
			}
		}
}
