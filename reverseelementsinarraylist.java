/* Write a Java program to reverse elements in an array list.*/

package first2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseelementsinarraylist {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Graps");
		list.add("Banana");
		list.add("Papaya");
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
