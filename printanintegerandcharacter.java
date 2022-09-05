/*Create a class to print an integer and a character with two methods having
the same name but different sequence of the integer and the character
parameters. For example, if the parameters of the first method are of the
form (int n, char c), then that of the second method will be of the form
(char c, int n).*/


package first2;

class  print{
	
	public void show(int n,char c)
	{
		System.out.println("int data::"+n);
		System.out.println("char data::"+c);
	}
	
	public void show(char c,int n)
	{
		System.out.println("char data::"+n);
		System.out.println("int data::"+c);
	}
	
}


public class printanintegerandcharacter
{
	public static void main(String[] args) 
	{
		print obj = new print();
		obj.show(5, 'y');
		obj.show(10, 'a');
	}

}
