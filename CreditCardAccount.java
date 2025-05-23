package com.encapsulation;

public class CreditCardAccount {
	 private String customerName;
	 private double creditLimit;
	 private double currentDebt;
	 private double interestRate;
	 public CreditCardAccount(String customerName, double creditLimit, double currentDebt, double interestRate)
	 {
		 this.customerName=customerName;
		 this.creditLimit=creditLimit;
		 this.currentDebt=currentDebt;
		 this.interestRate=interestRate;
	 }
	 public String toString()
	 {
		 return "Account is Created \n Customer name :"+customerName+"\n Credit Limit :"+creditLimit+"\n Current Debt :"+currentDebt+"\n Interest Rate :"+interestRate;

	 }
	
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName()
	{
		this.customerName=customerName;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
	public void setCreditLimit()
	{
		this.creditLimit=creditLimit;
	}
	public double getCurrentDebt()
	{
		return currentDebt;
	}
	public void setCurrentDebt()
	{
		 this.currentDebt=currentDebt;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void setInterestRate()
	{
		this.interestRate=interestRate;
	}
	public void swipeCard(double amount)
	{
		if(amount>creditLimit)
		{
			System.out.println("Transaction Declined : Limit Exceeded");
		}
		else
		{
			currentDebt +=amount;
			System.out.println("Transaction approved : Current debt is "+currentDebt);
		}
	}
	public void makePayment(int amount)
	{
		if(amount>currentDebt)
		{
			System.out.println("Excess Payment Not Allowed");
		}
		else
		{
			currentDebt -= amount;
			System.out.println("Payment Done:"+currentDebt +" Balance");
		}
	}
		public void applyInterest()
		{
		double interest = currentDebt * interestRate;
		currentDebt += interest;
		System.out.println("After applying interest :"+currentDebt);
}

public static void main(String[] args) {
	CreditCardAccount c = new CreditCardAccount("kiran", 10000,0 , 10);
	System.out.println(c);
	System.out.println("----------------------------");
	c.swipeCard(5000);
	c.makePayment(1000);
}
}

