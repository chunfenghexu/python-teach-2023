package overclass;

import java.util.ArrayList;

public class Lender extends Individual{
	private int MonthlyIncome;
	private static ArrayList<Loan> loans= new ArrayList<Loan>();
	public Lender()
	{
		
	}
	public Lender(int ID, String name, int MonthlyIncome)
	{
		super(ID,name);
		this.MonthlyIncome = MonthlyIncome;
	}
	public int getMonthlyIncome() {
		return MonthlyIncome;
	}
	public void setMonthlyIncome(int monthlyIncome) {
		MonthlyIncome = monthlyIncome;
	}
	
	public String toString()
	{
		return super.toString() +"\n" + "monthly income: " +this.MonthlyIncome;
	}

}
