/* Create a class named 'Shape' with a method to print "This is this is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the 
Shape class, both having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 'Square' of 
'Rectangle' having a method to print "Square is a rectangle". Now call the 
method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/

package first2;

class Shape1
{
	public void Shape2() {
		System.out.println("THis is Shape");
	}
}

class Rectangle1 extends Shape1
{
	public void rec()
	{
		System.out.println("This is Rectangluar Shape");
	}
}

class Circle extends Shape1
{
	public void Cir()
	{
		System.out.println("This is Circle Shape");
	}
}

class Square1 extends Rectangle1
{
	public void Squ()
	{
		System.out.println("This is Square is Rectangle");
	}
}



public class Shapewithmethodtoprint {
	public static void main(String[] args) {
		Square1 s = new Square1();
		s.rec();
		s.Squ();
	
		
	}

}
