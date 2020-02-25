import java.util.*;
public class SavingsAccountTest 
{
	public static void main(String[] args){

		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		System.out.println("Saver 1    4% Interest");
		saver1.annualInterestRate = .04;
		saver1.calculateMonthlyInterest(2000.00);
		System.out.println("Saver 2    4% Interest");
		saver2.annualInterestRate = .04;
		saver2.calculateMonthlyInterest(3000.00);

		System.out.println("Saver 1     5% Interest");
		saver1.annualInterestRate = .05;
		saver1.calculateMonthlyInterest(2000.00);
		System.out.println("Saver 2     5% Interest");
		saver2.annualInterestRate = .05;
		saver2.calculateMonthlyInterest(3000.00);

		}
}
