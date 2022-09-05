/* W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
zero exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
*/

package first2;

public class multiplecatchblock {
	public static void main(String[] args) {
		try
		{
			int a[] = new int[5];
			a[5]=30/3;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("THis is ArithmeticException");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error ::This is Indexout of Bounds Exceptiopn");
		}
	}

}
