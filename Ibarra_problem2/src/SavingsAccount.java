import java.util.*;
public class SavingsAccount 
{
	static double annualInterestRate;

	private double savingsBalance;

	public void calculateMonthlyInterest(double savingsBalance){

		double monthInterest = (annualInterestRate * savingsBalance)/12;

		System.out.println(" Month        Balance");
		
		for (int i = 0; i < 13; i++)
		{
			 
			savingsBalance += monthInterest;
			System.out.println("   "+ (i+1) + "           "  +savingsBalance);
		}

	}

	public static void modifyInterestRate(double newRate){
		annualInterestRate = newRate;
	}
}
