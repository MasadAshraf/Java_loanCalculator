package loanCalculator;
import java.util.*;

public class LoanCalculator 

	{
	
	private Loan loan;
	public static void main(String[] arg)
	{
		 
		LoanCalculator calculator = new LoanCalculator();
		calculator.start();
	}
	
	public LoanCalculator()
	{
	
	}

	
	public void start()
	{
		getInput();
		computePayment();
		displayOutput();
		
	}
	private void getInput()
	{
		 double loanAmount ,annualInterest ;
		 int loanPeriod;
		
		System.out.println("Enter Amount for loan");
		Scanner scanner = new Scanner(System.in);
		loanAmount = scanner.nextDouble();
		
		System.out.println("Enter annual interest");
		annualInterest = scanner.nextDouble();
		
		System.out.println("Enter your loan period in years");
		loanPeriod = scanner.nextInt();
		
		loan = new Loan(loanAmount,annualInterest,loanPeriod);
		
	}
	private void computePayment()
	{
//		System.out.println("Your monthly Payment is :" + loan.getMonthlyPayment());
	
		 
		
	}
	private void displayOutput()
	{

		System.out.println("Your monthly Payment is :" + loan.getMonthlyPayment());
		System.out.println("Your total Payment is :" + loan.getTotalPayment());
		
		
	}
	
	
}

