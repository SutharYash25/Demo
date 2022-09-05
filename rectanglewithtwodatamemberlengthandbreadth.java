/* Create a class named 'Rectangle' with two data members 'length' and   
'breadth' and two methods to print the area and perimeter of the 
rectangle respectively. Its constructor having parameters for length and 
breadth is used to initialize the length and breadth of the rectangle. Let 
class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class 
as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

package first2;

class Rectangle
{
	int length,breadth;
	
	public Rectangle(int l,int b)
	{
		this.length = 1;
		this.breadth = b;
	}
	void print_area()
	{
		System.out.println(length*breadth);
	}
	void print_perimeter()
	{
		System.out.println(2*(length+breadth));
	}
}

class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
}

public class rectanglewithtwodatamemberlengthandbreadth {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(20,40);
		Square s = new Square(5);
		System.out.println("The area of Rectangle is::");
		r.print_area();
		System.out.println("The parimeter is Rectangle::");
		r.print_perimeter();
		System.out.println("The area of square::");
        r.print_area();
        System.out.println("The perimeter of Square::");
        r.print_perimeter();
	}

}
