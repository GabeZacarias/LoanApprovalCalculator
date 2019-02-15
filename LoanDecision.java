import java.util.Scanner;

/**
 * 
 */

/**
 * @author GabrielZacarias
 *
 */
public class LoanDecision 
{

	/**
	 * @param args
	 */
	enum CreditRiskEnum 
	{
		INVALID, POOR, FAIR, GOOD, VERYGOOD, EXCELLENT;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//credit Score numbers
		double PoorScore = 300;
		double FairScore = 580;
		double GoodScore = 670;
		double VeryGoodScore = 740;
		double ExcellentScore = 800;
		double highestExcellentScore = 850;
		double creditScore;
	
		//Loan numbers
		double poorLoan = 500;
		double fairLoan = 1000;
		double goodLoan = 2000;
		double veryGoodLoan = 5000;
		double excellentLoan = 10000;
		double loanAmount;
		
		//loan application denied
		CreditRiskEnum risk = CreditRiskEnum.INVALID;
		
		//credit score input and invalid check
		System.out.print("Enter the Credit Score: ");
		creditScore = input.nextDouble();
			
			if (creditScore < 300)
				System.out.println("The credit score is invalid.");
		
		//loan amount input and invalid check
		System.out.print("Enter the Loan Amount: ");
		loanAmount = input.nextDouble();
			
			if (loanAmount < 500)
				System.out.println("The loan amount is invalid.");

		
		//assigning enum
		 if (creditScore >= ExcellentScore && creditScore <= highestExcellentScore && loanAmount <= excellentLoan && loanAmount >= poorLoan)
			risk = CreditRiskEnum.EXCELLENT;
		
		else if (creditScore >= VeryGoodScore && creditScore < ExcellentScore && loanAmount <= veryGoodLoan && loanAmount >= poorLoan)
			risk = CreditRiskEnum.VERYGOOD;
		
		else if (creditScore >= GoodScore && creditScore < VeryGoodScore && loanAmount <= goodLoan && loanAmount >= poorLoan)
			risk = CreditRiskEnum.GOOD;
		
		else if (creditScore >= FairScore && creditScore < GoodScore && loanAmount <= fairLoan && loanAmount >= poorLoan)
			risk = CreditRiskEnum.FAIR;
		
		else if (creditScore >= PoorScore && creditScore < FairScore && loanAmount == poorLoan)
			risk = CreditRiskEnum.POOR;
		
		
		switch (risk)
		{
			
			case EXCELLENT:
				if (risk == CreditRiskEnum.EXCELLENT)
				{
					System.out.println("The loan application is approved"); 
					break;
				}
			
			case VERYGOOD:
				if (risk == CreditRiskEnum.VERYGOOD)
				{	
					System.out.println("The loan application is approved");
					break;
				}
			
			case GOOD:
				if (risk == CreditRiskEnum.GOOD)
				{
					System.out.println("The loan application is approved");
					break;
				}
				
			case FAIR:
				if (risk == CreditRiskEnum.FAIR)
				{
					System.out.println("The loan application is approved");
					break;
				}
			
			case POOR:
				if (risk == CreditRiskEnum.POOR)
				{
					System.out.println("The loan application is approved");
					break;
				}
			
			default:
					System.out.println("The loan application is denied");
					break;	
		}
		

	}

}
