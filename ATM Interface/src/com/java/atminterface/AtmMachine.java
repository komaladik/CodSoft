package com.java.atminterface;

import java.util.Scanner;

class UsersBankAccount {

	private double balance;
	
	public UsersBankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double withdrawAmount){
		
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount+"Amount Withdrew ");
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient funds.\n");
        } else {
            System.out.println("Invalid withdrawal amount.\n");
        }
		
	}
	public void deposit(double depositAmount){
		
		if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println(depositAmount+"Amount Deposited ");
        } else {
            System.out.println("Invalid deposit amount.\n");
        }
	}
	
	public void checkBalance(){
		
		System.out.println("Your Balance is "+balance);
	}

}

public class AtmMachine {
	
	private UsersBankAccount userBankAccount;
	
	public AtmMachine(UsersBankAccount userBankAccount) {
		this.userBankAccount = userBankAccount;
	}
	
	public void switchCaseChoice() {

		int choice;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter 1 to Withdraw Amount");
			System.out.println("Enter 2 to Deposit Amount");
			System.out.println("Enter 3 to Check Balance");
			System.out.println("Enter 4 to Exit\n");
			
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			
			switch(choice) {
			
				case 1:
					System.out.println("Enter Withdraw Amount");
					double withdrawAmmount = scanner.nextDouble();
					userBankAccount.withdraw(withdrawAmmount);
					break;
					
				case 2:
					System.out.println("Enter Deposit Amount");
					double depositAmmount = scanner.nextDouble();
					userBankAccount.deposit(depositAmmount);
					break;
					
				case 3:
					userBankAccount.checkBalance();
					break;
					
				case 4:
					System.out.println("Thank you for using the ATM.");
					System.exit(0);
					System.out.println("");
					
				default:
					System.out.println("Invalid Choice, Enter Valid Choice\n");
					switchCaseChoice();
					
			}
		}
		while(choice!=4);
		
		
	}	
	public static void main(String[] args) {
		
		UsersBankAccount userBankAccount = new UsersBankAccount(50000.00);
		AtmMachine atmMachine = new AtmMachine(userBankAccount);
				
		System.out.println("Welcome to ATM Machine:\n");
			
		atmMachine.switchCaseChoice();
	}
}
	


