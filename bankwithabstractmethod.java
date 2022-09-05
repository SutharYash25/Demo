/*Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
method named 'getBalance'. Call this method by creating an object of 
each of the three classes.
*/

package first2;


abstract class Bank
{
	public abstract void getBalance();
}

class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("BankA Deposite::$100");
	}
}

class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("BankA Deposite::$200");
	}
}

class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("BankA Deposite::$300");
	}
}


public class bankwithabstractmethod 
{
	public static void main(String[] args) 
	{
		BankA bA = new BankA();
		bA.getBalance();
		BankB bB = new BankB();
		bB.getBalance();
		BankC bC = new BankC();
		bC.getBalance();
		
	}

}
