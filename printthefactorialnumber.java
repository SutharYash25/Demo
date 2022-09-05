/* Write a program to print the factorial of a number by defining a method 
named 'Factorial'. Factorial of any number n is represented by n! and is 
equal to 1*2*3*. *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0
*/

package first2;

class factorial
{
	public int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	private int factorial(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

public class printthefactorialnumber 
   { 
        public static void main(String[] args)
        {
			int i,fact=1;
			int number=4;
			fact = factorial(number);
			System.out.println("Factorial of"+number+"is:"+fact);
	    }

		private static int factorial(int number) {
			// TODO Auto-generated method stub
			return 0;
		}
   }
