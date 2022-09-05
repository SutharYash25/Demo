/* Write a Java program to get the number of elements in a hash set*/

package first2;

import java.util.HashSet;

public class Getthenumberofelements {
     public static void main(String[] args) {
    	 HashSet<String> hash = new HashSet<String>();
    		hash.add("C");
    		  hash.add("c++");
    		  hash.add("HTML");
    		  hash.add("Python");
    		  hash.add("Java");
    		  hash.add("PHP");
    		  
    		  System.out.println(hash);
    		  System.out.println("Number of elements is"+hash);
    
	}
}
