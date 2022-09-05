/* Write a Java program to get a collection view of the values contained in 
this map.*/

package first2;

import java.util.HashMap;

public class Collectionviewofthevaluesinmap {
  public static void main(String[] args) {
	  HashMap hash = new HashMap<>();
	  hash.put(1, "Yash");
	  hash.put(2, "Nirav");
	  hash.put(3, "Jeet");
	  hash.put(4, "Deep");
	  
	  System.out.println("Collection view:"+hash.values());
	  
	
  }
}
