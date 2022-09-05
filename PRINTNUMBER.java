/*Create a class named 'PrintNumber' to print various numbers of different
data types by creating different methods with the same name 'printn'
having a parameter for each data type.*/

package first2;

class Printnu{
	public void print(int a)
	{
		System.out.println(a);
	}
	public void print(double b)
	{
		System.out.println("double ::"+b);
	}
	public void print(String c)
	{
		System.out.println("string :"+c);
	}
	public void print(char ch)
	{
		System.out.println(ch);
	}
}
public class  PRINTNUMBER
{
	public static void main(String[] args) {
		  
		Printnu n= new  Printnu();
		n.print(5);	
		n.print(5.69);
		n.print("yash");
		n.print('g');
	}
}
