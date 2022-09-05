/* Write a Java program to check whether a map contains key-value 
mappings (empty) or not.*/

package first2;

import java.util.HashMap;

public class CheckWetheramapcontainskeyvalue {
	public static void main(String[] args) {
		HashMap Hash = new HashMap<>();
		Hash.put(1, "Ahmedabad");
		Hash.put(1, "Naroda");
		Hash.put(1, "Maninagar");
		Hash.put(1, "Chandkheda");
		Hash.put(1, "Gota");
		
		Boolean ans = Hash.isEmpty();
		System.out.println(ans);
		
	}

}
