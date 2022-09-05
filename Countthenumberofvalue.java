/* Write a Java program to count the number of key-value (size) mappings 
in a map.*/

package first2;

import java.util.HashMap;

public class Countthenumberofvalue {
	public static void main(String[] args) {
		HashMap<Integer , String> Map = new HashMap<Integer , String>();
		  Map.put(1, "Hindi");
		  Map.put(2, "English");
		  Map.put(3, "Tamil");
		  Map.put(4, "Gujrati");
		  Map.put(5, "Jerman");
		  Map.put(1, "Sanskrit");
		  System.out.println(Map);
		  System.out.println("Size of elements::"+Map.size());
	}

}
