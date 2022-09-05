/* W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. lang. ArithmeticException: not valid
*/

package first2;


import java.util.Scanner;


public class validatemethodtotakesint {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Entyer age");
			int a=sc.nextInt();
			
			if (a<18)
			{
				throw new ArithmeticException("Arithmetic Exception");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
