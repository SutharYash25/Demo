/*Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters.
The method for printing area of a rectangle has two parameters which are
length and breadth respectively while the other method for printing area
of square has one parameter which is side of square.*/

package first2;

import java.util.Scanner;

class method
{

	public void mathods(int s)
	{
		
		int a=4*s;
		
		System.out.println("Area of Square::"+a);
	}
	public void mathods(int l,int b)
	{
		
		int r = l*b;
		System.out.print("Area of Recatangle::"+r);
		
	}
}

public class areaofsquareofrectangle {
	public static void main(String[] args) {
		method obj = new method();
		System.out.println("Square");
		Scanner sc = new Scanner(System.in);
		int sq,lh,bd;
		System.out.println("enter square side::");
		sq = sc.nextInt();
		obj.mathods(sq);
        System.out.println("_____________________");
        System.out.println("Rectangle");
        System.out.println("Enter rectangle length::");
        lh = sc.nextInt();
        System.out.println("Enter Rectangle width");
        bd = sc.nextInt();
        obj.mathods(lh, bd);
	}

}
