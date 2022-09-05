/*We have to calculate the area of a rectangle, a square and a circle. Create 
an abstract class 'Shape' with three abstract methods namely 
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its 
length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
is its radius. Now create another class 'Area' containing all the three 
methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 
'Area' and call all the three methods.*/

package first2;

import java.util.Scanner;

abstract class Shape
{
	abstract void RectangleArea(int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(double radius);
}

class Area extends Shape
{
	
	
	void RectangleArea(int length,int breadth)
	{
		System.out.println("Area of Rectangle:"+2*(length+breadth));
	}
	
	void SquareArea(int side)
	{
		System.out.println("Area of Square:"+4*(side));
	}
	
	void CircleArea(double radius)
	{
		System.out.println("Circle:"+3.14*radius*radius);
	}
	
	
}

public class calculateofrectangleasquareandcircle 
   {
     public static void main(String[] args)
     {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth for Rectangle:");
		int l = sc.nextInt();
		int b  = sc.nextInt();
		System.out.println("Enter side of Square");
		int s = sc.nextInt();
		System.out.println("Enter radius of Circle");
		double r = sc.nextDouble();
		a.RectangleArea(l, b);
		a.SquareArea(s);
		a.CircleArea(r);
		
	}
}
