import java.util.Scanner;


public class CreditLimitCalculator {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter the account number or -1 to skip
		System.out.print("Enter the account number: ");
		int accountNumber = input.nextInt();
		
		//enter the while loop if the account number does not equal -1
		while(accountNumber != -1)
		{
			//prompt the user to enter beginning balance
			System.out.print("Enter the balance at the beginning of the month: ");
			int beginningBalance = input.nextInt();
			
			//prompt the user to enter the total of all items charged this month
			System.out.print("Enter the total of all the items charged this month: ");
			int totalCharged = input.nextInt();
			
			//prompt the user to enter the total credits applied to the users account
			System.out.print("Enter the total of all the credits applied this month: ");
			int totalCredits = input.nextInt();
			
			//prompt the user to end the credit limit
			System.out.print("Enter the credit limit: ");
			int creditLimit = input.nextInt();
			
			//calculate the new balance
			int newBalance = beginningBalance + totalCharged - totalCredits;
			
			//determine if new balance is greater than the credit limit
			if(newBalance > creditLimit)
			{
				System.out.println("Credit limit exceeded");
			}
			
			//prompt the user to enter the accountNumber to continue or quit the loop with -1
			System.out.print("\nEnter the account number: ");
			accountNumber = input.nextInt();
		}
		
	}
}
