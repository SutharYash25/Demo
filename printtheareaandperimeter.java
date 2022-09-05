/* B41. Write a program to print the area and perimeter of a triangle having 
sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
parameter in its constructor*/

package first2;

import java.util.Scanner;

class triangle
{
	int b,l;
	double ans;
	
	public triangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter B");
		b=sc.nextInt();
		System.out.println("enter L");
		l=sc.nextInt();
		ans =0.5*l*b;
		System.out.println("The area of rectangle ");
		
	}
	triangle(int a,int b,int c)
	{
		ans=a+b+c;
		System.out.println("The perimeter of tringle"+ans);
	}
}

public class printtheareaandperimeter {
	public static void main(String[] args) {
		triangle ta = new triangle();
		triangle tp = new triangle(3,4,5);
		
		
	}

}
