/* W.A.J.P to read 10 integer values using Scanner class from keyboard. 
Generate the exception if the entered value is less than 10 and or greater 
than 40. Program should display appropriate message as and when this 
exception occurs otherwise it will display all the entered values.*/

package first2;

import java.util.Scanner;

class demoexception extends Exception
{
	public demoexception(String string)
	{
		
	}
}


public class read10intvalueusingscannerclass {
	public static void main(String[] args) {
		try
		{
			System.out.println("Enter Number::");
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			int ans = no/0;
			
			throw new Exception("not valid");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
