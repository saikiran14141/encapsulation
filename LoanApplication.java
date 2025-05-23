package com.encapsulation;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int longTerm;
	private double outStandingBalance;
	
	public LoanApplication(String customerName, double loanAmount,  double interestRate, int longTerm,double outStandingBalance)
	{
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.longTerm=longTerm;
		this.outStandingBalance=outStandingBalance;
	}
	public String toString()
	{
		return " Customer name :"+customerName+"\n Loan Amount :"+loanAmount+"\n Interest Rate :"+interestRate+"\n Long Term :"+longTerm+"\n Out Standing Balance :"+outStandingBalance;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName()
	{
		this.customerName=customerName;
	}
	public double getLoanAmount()
	{
		return loanAmount;
	}
	public void setLoanAmount()
	{
		this.loanAmount=loanAmount;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void setInterestRate()
	{
		this.interestRate=interestRate;
	}
	public int getLongterm()
	{
		return longTerm;
	}
	public void setLongTerm()
	{
		this.longTerm=longTerm;
	}
	public double getOutStandingBalance()
	{
		return outStandingBalance;
	}
	public void setOutStandingBalance()
	{
		this.outStandingBalance=outStandingBalance;
	}
	public double makePayment(double amount)
	{
		if(amount>outStandingBalance)
		{
			System.out.println("Payment Exceeds Loan balance");
		}
		else if(amount <=0)
		{
			System.out.println("Invalid Payment amount");
		}
		else
		{
			outStandingBalance=outStandingBalance-amount;
		}
		return amount;
	}
	public double calculateEMI()
	{
//		 return (loanAmount * interestRate * Math.pow(1 + interestRate,longTerm))/(Math.pow(1 + interestRate, longTerm) - 1);
		 double monthlyRate = interestRate / 12 / 100;
	        int numberOfMonths = longTerm * 12;
	        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
	               (Math.pow(1 + monthlyRate, numberOfMonths) - 1);
	}
	public static void main(String[] args) {
		LoanApplication loanApplication = new LoanApplication("Kiran", 500000, 8.5, 5, 500000);
		System.out.println(loanApplication);
		System.out.println("-------------------------");
		double res=loanApplication.makePayment(300);
		System.out.println("Payment Successful :"+res);
		System.out.println("-------------------------");
		System.out.println(loanApplication);
		System.out.println("-------------------------");
		double res2=loanApplication.calculateEMI();
		System.out.println("Calculated EMI :"+res2);
	}
	
	
}

