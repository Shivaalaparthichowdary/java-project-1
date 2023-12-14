package Shiva;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {

Scanner input = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
private int customerNumber;
private int pinNumber;
private double savingBalance=0;
private double checkingBalance=0;

public int setCustomerNumber(int customerNumber)
{
	this.customerNumber=customerNumber;
	return customerNumber;
}

public int getCustomerNumber()
{
	return customerNumber;
	
}
public int setPinNumber(int pinNumber)
{
	this.pinNumber=pinNumber;
	
	return pinNumber;
}
public int getPinNumber()
{
	return pinNumber;
}

public double getCheckingBalance()
{
	return checkingBalance;
}

public double getSavingBalance()
{
	return savingBalance;
}
/* calculate checking withdraw */
public double calcCheckingWithdraw(double amount)
{
	checkingBalance =(checkingBalance- amount);
	return checkingBalance;
	
}
/*  calculate saving account balance*/
 public double calcSavingWithdraw(double amount)
 {
	 savingBalance =(savingBalance- amount);
	 return savingBalance;
 }
 
 /* calculate checking depoist */
 public double calcCheckingDepoist(double amount)
 {
 	checkingBalance =(checkingBalance+amount);
 	return checkingBalance;
 	
 }
 
 /*  calculate saving account depoist*/
 public double calcSavingDepoist(double amount)
  {
	 savingBalance =(savingBalance+amount);
	 return savingBalance;
  }
 /* customer  checking account withdraw input */
 public void getCheckingWithdrawInput()
 {
	 System.out.println("checking account balance" + moneyFormat.format(checkingBalance));
	 System.out.println("amount you want to withdraw from checking account ");
	 
	 double amount =input.nextDouble();
	 
	 if((checkingBalance - amount)>= 0)
	{
		 calcCheckingWithdraw(amount);
	  System.out.println("new checking amount balance" + moneyFormat.format(checkingBalance));
	 }
	 else
	 {
		 System.out.println("balance can't be negative");
	 }	  
 }
 
 /* customer saving account withdraw input */
 public void getSavingingWithdrawInput()
 {
	
	System.out.println("saving account balance" + moneyFormat.format(savingBalance));
	 System.out.println("amount you want to withdraw from saving account ");
	 
	 double amount =input.nextDouble();
	 
	 if((savingBalance - amount)>= 0)
	{
		 calcSavingWithdraw(amount);
	  System.out.println("new saving  amount balance" + moneyFormat.format(savingBalance));
	 }
	 else
	 {
		 System.out.println("balance can't be negative");
	 }	  
 }
 /* customer checking account depoist input*/
 public void getCheckingDepoistInput()
 {
	 System.out.println("checking account balance" + moneyFormat.format(checkingBalance));
	 System.out.println("amount you want to depoist from checking account ");
	 
	 double amount =input.nextDouble();
	 
	 if((checkingBalance - amount)>= 0)
	{
		 calcCheckingDepoist(amount);
	  System.out.println("new checking amount balance" + moneyFormat.format(checkingBalance));
	 }
	 else
	 {
		 System.out.println("balance can't be negative");
	 }	  
 }
 
 /* customer saving account depoist input */
 public void getSavingingDepoistInput()
 {
	
	System.out.println("saving account balance" + moneyFormat.format(savingBalance));
	 System.out.println("amount you want to depoist from saving account ");
	 
	 double amount =input.nextDouble();
	 
	 if((savingBalance - amount)>= 0)
	{
		 calcSavingDepoist(amount);
	  System.out.println("new saving  amount balance" + moneyFormat.format(savingBalance));
	 }
	 else
	 {
		 System.out.println("balance can't be negative");
	 }	  
 }

}
