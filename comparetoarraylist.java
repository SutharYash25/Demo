/*Write a Java program to compare two array lists.*/

package first2;

import java.util.ArrayList;
import java.util.List;

public class comparetoarraylist {
  public static void main(String[] args) {
	  List<String> Mylist = new ArrayList<>();
	  
	  Mylist.add("yash");
	  Mylist.add("Jeet");
	  Mylist.add("Deep");
	  Mylist.add("Nirav");
	  
List<String> Mylist1 = new ArrayList<>();
	  
	  Mylist1.add("yash");
	  Mylist1.add("Jeet");
	  Mylist1.add("Deep");
	  Mylist1.add("Nirav");
	  
	  System.out.println("Values from list:"+Mylist);
	  
	  System.out.println("Values from list1:"+Mylist1);
	  
	  if(Mylist.equals(Mylist1) != false)
	  {
		  System.out.println("Both Lists are same");
	  }
	  else
	  {
		  System.out.println("Both Lists are not same");
	  }
   }
}
