package first2;

import java.util.HashSet;
import java.util.Iterator;

public class iteratethroughtoallelementsinhashlist {
   public static void main(String[] args) {
	   HashSet<String> hash = new HashSet<String>();
		hash.add("C");
		  hash.add("c++");
		  hash.add("HTML");
		  hash.add("Python");
		  hash.add("Java");
		  hash.add("PHP");
		  
		  System.out.println(hash);
		  Iterator<String> it = hash.iterator();
		  while(it.hasNext())
			  {
			    System.out.println(it.next());
			  }
}
}
