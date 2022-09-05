/* W.A.J.Pto create a custom exception if Customer withdraw amount which 
is greater than account balance then program will show custom exception 
otherwise amount will deduct from account balance.
Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this 
transaction.*/

package first2;

import java.util.Scanner;

class Account
{
	private int balance = 2000,withdraw;
	public  int balance (int balance)
	{
		this.balance=balance;
		
		return balance;
		
		
	} 
	
}

public class Customerwithdrawamount {
	public static void main(String[] args) {
		int balance = 2000,withdraw;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("ATM");
			System.out.println("Choose For Withdraw");
			System.out.println("Choose For Deposit");
			System.out.println("Choose For Check Balance");
			System.out.println("Choose For Exit");
			System.out.print("Choose the operation you want to perform:");
			int n = sc.nextInt();
			
			{
			   System.out.println("Enter money to be withdraw");
		       withdraw = sc.nextInt();
		       if(balance >= withdraw)
		       {
		    	   balance = balance -withdraw;
		    	   System.out.println("please collect your money");
		       }
		       else
		       {
		    	   System.out.println("Insufficient Balance");
		       }
		       System.out.println("");
			}
		}
	     
	}

}
