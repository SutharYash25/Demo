/* Write a Java program to associate the specified value with the specified 
key in a HashMap. */

package first2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class specifiedkeyinHashMap {
  public static void main(String[] args) {
	  HashMap<Integer , String> Map = new HashMap<Integer , String>();
	  Map.put(1, "Hindi");
	  Map.put(2, "English");
	  Map.put(3, "Tamil");
	  Map.put(4, "Gujrati");
	  Map.put(5, "Jerman");
	  Map.put(1, "Sanskrit");
	  System.out.println(Map);
	  
	  Set  set = Map.entrySet();
	  Iterator it = set.iterator();
	  while(it.hasNext())
	  {
		  Map.Entry<Integer , String> entry = (Entry<Integer , String>)it.next();
		  System.out.println(entry.getKey()+"" +entry.getValue());
	  }
  }
}
