/* Write a Java program to compare two sets and retain elements which are 
same on both sets*/

package first2;

import java.util.HashSet;

public class Comparetosetsandretainelements {
   public static void main(String[] args) {
	 HashSet list = new HashSet<>();
	 
	 list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     
     System.out.println("First list");
     
     HashSet list1 = new HashSet<>();
     
     list1.add(1);
     list1.add(4);
     list1.add(3);
     list1.add(6);
     list1.add(7);
     
     System.out.println("list 1"+list1);
     list.retainAll(list1);
     System.out.println(list);
     
     
  }
}
