package overclass;

public class Loan {
	private int ID;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	
	public Loan(int ID,double loanAmount,double interestRate,int loanTerm)
	{
		this.ID=ID;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public String toString()
	{
		return "ID:" + this.ID + "\n" +"loan amount: " + this.loanAmount + "\n" +"interest rate: " + this.interestRate + "\n" +"loan term: " + this.loanTerm;
	}
	public String toString1()
	{
		return "loan amount: " + this.loanAmount + "\n" +"interest rate: " + this.interestRate + "\n" +"loan term: " + this.loanTerm;
	}
	
}
