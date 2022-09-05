/* W.A.J. P to demonstrate try catch block,
 Take two numbers from the user and perform the division operation and 
handle Arithmetic Exception. O/PEnter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/

package first2;

import java.util.Scanner;

public class trycatchblock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			int ans=a/b;
			System.out.println(ans);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Not divid by zero");
		}
		
	}

}
