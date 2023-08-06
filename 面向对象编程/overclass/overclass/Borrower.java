package overclass;

import java.util.ArrayList;

public class Borrower extends Individual {
	private int maxLoanAmount;
	private static ArrayList<Loan> loans= new ArrayList<Loan>();
	public Borrower()
	{
		
	}
	
	public Borrower(int ID, String name, int maxLoanAmount)
	{
		super(ID,name);
		this.maxLoanAmount = maxLoanAmount;
	}

	public int getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(int maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	
	public String toString()
	{
		return super.toString() +"\n" + "max loan amount: " +this.maxLoanAmount;
	}
}
