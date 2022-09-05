/*Create a class with a method that prints "This is a parent class" and its 
subclass with another method that prints "This is child class". Now, create 
an object for each of the class and call 1 - method of parent class by object 
of parent class 2 - method of child class by object of child class 3 - method 
of parent class by object of child class
*/


package first2;

class print1{
	public void print() 
	{
		System.out.println("This is a parant class");
	}
	
}

class child extends print1
    {
	    public void show()
	    {
	    	System.out.println("This is a child class");
	    }
	
}


public class methodthatprintthisisaparantclass 
  {
	public static void main(String[] args) 
	   {
		  print1 p = new print1();
		  p.print();
		  child c = new child();
		  c.show();// child class call print class
		  c.print();
		  
	   }

}
