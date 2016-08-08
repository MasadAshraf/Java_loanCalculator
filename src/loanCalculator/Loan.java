package loanCalculator;

public class Loan {
	private static final int MONTHS_IN_YEAR = 12;
	private double loanAmount,monthlyInterestRate;
	private int numberOfPayments;

	public  Loan(double amount , double rate, int period  )
	{
		setAmount(amount);
		setRate(rate);
		setPeriod(period);
		
	}
	public void setAmount(double amount)
	{	
		loanAmount = amount;
		
	}
	public void setRate(double rate)
	{
		monthlyInterestRate = rate / 100 / MONTHS_IN_YEAR;
	}
	public void setPeriod(int period)
	{
		numberOfPayments = period * MONTHS_IN_YEAR;
	}
	public double getAmount()
	{
		return loanAmount;
		
	}
	public double getRate()
	{
		return monthlyInterestRate * 100.0 * MONTHS_IN_YEAR;
		
		
	}
	public int getPeriod()
	{
		return numberOfPayments / MONTHS_IN_YEAR;
	}
	public double getMonthlyPayment()
	{
		return (loanAmount * monthlyInterestRate) / (1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
	}
	public double getTotalPayment()
	{
		return getMonthlyPayment() * numberOfPayments;
	}
}
