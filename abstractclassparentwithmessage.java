/* Create an abstract class 'Parent' with a method 'message'. It has two 
subclasses each having a method with the same name 'message' that 
prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass*/

package first2;


abstract class Parent
{
	public void message()
	{
		
	}
}

class Subclass1 extends Parent
{
	public void message() 
	{
		System.out.println("This is First Subclass");
	}
}

class Subclass2 extends Parent
{
	public void message() 
	{
		System.out.println("This is Second Subclass");
	}
}


public class abstractclassparentwithmessage 
{
	public static void main(String[] args) 
	{
		Subclass1 s1 = new Subclass1();
		Subclass2 s2 = new Subclass2();
		
		s1.message();
		s2.message();
		
		
	}

}
