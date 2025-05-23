package com.encapsulation;

public class FixedDepositAccount {
	private String customerName;
	 private double principalAmount;
	 private double interestRate;
	 private int duration;
	 private double maturityAmount;
	 
	 public FixedDepositAccount(String customerName,double principalAmount, double interestRate, int duration, double maturityAmount)
	 {
		 this.customerName=customerName;
		 this.principalAmount=principalAmount;
		 this.interestRate=interestRate;
		 this.duration=duration;
		 this.maturityAmount=maturityAmount;
	 }
	 public String toString()
	 {
		 return "Fixed Deposit Credited Successfully \n Customer name :"+customerName+"\n Principle Amount Amount :"+principalAmount+"\n Interest Rate :"+interestRate+"\n Duration :"+duration+"\n Maturity Amount :"+maturityAmount;
	    }
	 public String getCustomerName()
		{
			return customerName;
		}
		public void setCustomerName()
		{
			this.customerName=customerName;
		}
		public double getPrincipalAmouny()
		{
			return principalAmount;
		}
		public void setPrincipalAmount()
		{
			this.principalAmount=principalAmount;
		}
		public double getInterestRate()
		{
			return interestRate;
		}
		public void setInterestRate()
		{
			this.interestRate=interestRate;
		}
		public int getDuration()
		{
			return duration;
		}
		public void setDuration()
		{
			this.duration=duration;
		}
		public double getMaturityAmount()
		{
			return maturityAmount;
		}
		public void setMaturityAmount()
		{
			this.maturityAmount=maturityAmount;
		}
		public double calculateMaturityAmount()
		{
			 return principalAmount * Math.pow(1 + (interestRate / 100), duration);
		}
		public String withdrawBeforeMaturity(double amount, int completedYears)
		{
			if(completedYears<1);
			{
				System.out.println("Cannot Withdraw before 5 years");
				double penality = amount * 0.02;
				double finalAmount= amount - penality;
				return "Penality Amount :"+penality+"\nFinal Amount :"+finalAmount;
				
			}
			
			
		}
		
		public static void main(String[] args) {
			FixedDepositAccount fda = new FixedDepositAccount("Kiran", 1000000, 9, 5, 1500000);
			System.out.println(fda);
			System.out.println("----------------------------------------");
			double res2 = fda.calculateMaturityAmount();
			System.out.println("Maturity Amount	:"+res2);
			System.out.println("----------------------------------------");
			String res=fda.withdrawBeforeMaturity(50000, 3);
			System.out.println(res);
		}
		
		
}

