package Shiva;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Optionmenu extends Account{
Scanner menuinput=new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

private int selection;

public void getlogin() throws IOException
{
	int x=1;
	do {
		try {
			data.put(9632104,22334);
			data.put(8490261,433216);
			System.out.println("welcome to the ATM project");
			
			System.out.print(" Enter your customer id:");
			setCustomerNumber(menuinput.nextInt());
			
			System.out.print("Enter your pin number:");
			setPinNumber(menuinput.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("invalid  user credentials");
		 x=2;
		}
		for(Entry<Integer, Integer> entry : data.entrySet())
		{
			if(entry.getKey() == getCustomerNumber() && entry.getValue()==getPinNumber())
             getAccountType();
		}
	 System.out.println("Wrong customer number or pin number");
	}
while( x==1);
}


public void getAccountType()
{
	System.out.println("select the account you want to access");
	System.out.println("TYpe-1  - checkingaccount");
	System.out.println("TYpe-2  - savingaccount");
	System.out.println("TYpe-3  - exit");
	System.out.println("choice:");
	
	selection = menuinput.nextInt();
	
	switch(selection) {
	
	case 1:
		getChecking();
		break;
		
	case 2:
		getSaving();
		break;
		
	case 3:
		System.out.println("thank you for using ATM");
		break;
		
		
	default:
		System.out.println("invalid choice");
		getAccountType();
		
	}
}
public void getChecking()
{
	System.out.println("checking account:");
	System.out.println("Type-1 - view Balance");
	System.out.println("Type-2 - amount Withdraw");
	System.out.println("Type-3 - depoist money");
	System.out.println("Type-4 - Exist");
	System.out.println("choice:");
   
	selection= menuinput.nextInt();
	
	switch(selection)
	{
	case 1:
	     System.out.println("checking account balance" + moneyFormat.format(getCheckingBalance()));
	     getAccountType();
	     break;
	     
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getCheckingDepoistInput();
		getAccountType();
		break;
	case 4:
		System.out.println("thank you for using this Atm");
		break;
		
	default:
		System.out.println("Invalid choice");
		getChecking();
	}
}
	

public void getSaving()
{
	System.out.println("checking account:");
	System.out.println("Type-1 - view Balance");
	System.out.println("Type-2 - amount Withdraw");
	System.out.println("Type-3 - depoist money");
	System.out.println("Type-4 - Exist");
	System.out.println("choice:");
   
	selection= menuinput.nextInt();
	
	switch(selection)
	{
	case 1:
	
		System.out.println("checking account balance" + moneyFormat.format(getSavingBalance()) );
	     getAccountType();
	     break;
	     
	case 2:
		getSavingingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getSavingingDepoistInput();
		getAccountType();
		break;
	case 4:
		System.out.println("thank you for using this Atm");
		break;
		
	default:
		System.out.println("Invalid choice");
		getSaving();
	}
}
}



