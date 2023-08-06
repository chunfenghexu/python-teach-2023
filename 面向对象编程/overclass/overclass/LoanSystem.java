package overclass;

import java.io.*;
import java.util.ArrayList;


public class LoanSystem {
	private static ArrayList<Borrower> borrowers= new ArrayList<Borrower>();
	private static ArrayList<Lender> lenders= new ArrayList<Lender>();
	private static ArrayList<Loan> loans= new ArrayList<Loan>();
	private static BufferedReader stdIn= new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdErr= new PrintWriter(System.err,true);
	private static PrintWriter stdOut= new PrintWriter(System.out,true);
	public static void main(String[] args) throws IOException
	{	
		LoanSystem ls = new LoanSystem();
		ls.borrowers.add(new Borrower());
		String menu = "[0] exit"+"\n"+
					  "[1] add a lender into the system"+"\n"+
				      "[2] look up a lender given an ID"+"\n"+
				      "[3] romove a lender from the system given an ID"+"\n"+
				      "[4] add a borrower given an ID"+"\n"+
				      "[5] look up a borrower given an ID"+"\n"+
				      "[6] romove a borrower from the system given an ID"+"\n"+
				      "[7] add a loan into the system"+"\n"+
				      "[8] look up a loan given an ID"+"\n"+
				      "[9] romove a loan from the system given an ID" +"\n"+
					  "[10] look up the loans from one borrower given an ID";
					  
		
		stdErr.println("Please select a function from the menu below > \n");
		stdErr.println(menu);
		int choice = Integer.parseInt(stdIn.readLine());
		while(choice != 0)
		{
			switch(choice)
			{
			case 1:
				addLender();
				break;
			case 2:
				lookUpLender();
				break;
			case 3:
				removeLender();
				break;
			case 4:
				addBorrower();
				break;
			case 5:
				lookUpBorrower() ;
				break;
			case 6:
				removeBorrower();
				break;
			case 7:
				addLoan();
				break;
			case 8:
				lookUpLoan();
				break;
			case 9:
				removeLoan();
				break;
			case 10:
				borrowList();
			}
			stdErr.println(menu);
			choice = Integer.parseInt(stdIn.readLine());
		}

	}
	
	
	private static void borrowList()
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<borrowers.size();i++)
			{
				if(borrowers.get(i).getID() == id)
				{
					stdErr.println(borrowers.get(i).getName() +"\n" +"ID:   " +borrowers.get(i).getID());
				}
				
			}
			int count =1;
			for(int i=0;i<loans.size();i++)
			{
				
				if(loans.get(i).getID() == id)
				{
					stdErr.println();
					stdErr.println("LOAN BILL "+ count + "\n" +loans.get(i).toString1());
					count++;
				}
				
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	private static void addLoan() 
	{
		try
		{
			stdErr.println("please enter your ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter your loan amount >");
			double loanAmount = Double.parseDouble(stdIn.readLine());
			stdErr.println("please enter your interest rate >");
			double interestRate = Double.parseDouble(stdIn.readLine());
			stdErr.println("please enter your loan term >");
			int loanTerm = Integer.parseInt(stdIn.readLine());
			LoanSystem.loans.add(
					new Loan(id,loanAmount,interestRate,loanTerm));
			
			double loan=0;
			for(int i=0;i<loans.size();i++)
			{
				
				if(loans.get(i).getID() == id)
				{
					loan+=loans.get(i).getLoanAmount();
					
				}

			}
			for(int i=0;i<borrowers.size();i++)
			{
				if(borrowers.get(i).getID() == id && loan>borrowers.get(i).getMaxLoanAmount())
				{	
					loans.remove(loans.size()-1);
					stdErr.println("You have overborrowed by "+(loan-borrowers.get(i).getMaxLoanAmount())+" dollars."+"\n"+"If you need the money urgently, please contact customer service to change your maximum loan amount");
					return;
				}
				else if(borrowers.get(i).getID() == id && loan<borrowers.get(i).getMaxLoanAmount())
				{
					stdErr.println("You are still " + (borrowers.get(i).getMaxLoanAmount()-loan) + " dollars away from the maximum loan");
				}
				
			}
			

			stdErr.println("Loan success");
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void removeLender() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<lenders.size();i++)
			{
				if(lenders.get(i).getID() == id)
				{
					lenders.remove(i);
					stdErr.println("deleted");
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	private static void lookUpLender() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<lenders.size();i++)
			{
				if(lenders.get(i).getID() == id)
				{
					stdErr.println(lenders.get(i).toString());
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private static void addLender() 
	{
		try
		{
			stdErr.println("please enter your ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter your name >");
			String name = stdIn.readLine();
			stdErr.println("please enter your monthly income >");
			int monthlyIncome = Integer.parseInt(stdIn.readLine());
			LoanSystem.lenders.add(
					new Lender(id,name,monthlyIncome));
			stdErr.println("Added one new lender now");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private static void addBorrower() 
	{
		try
		{
			stdErr.println("please enter your ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter your name >");
			String name = stdIn.readLine();
			stdErr.println("please enter your max loan amount >");
			int maxLoanAmount = Integer.parseInt(stdIn.readLine());
			LoanSystem.borrowers.add(
					new Borrower(id,name,maxLoanAmount));
			stdErr.println("Added one new borrower now");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void lookUpBorrower() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<borrowers.size();i++)
			{
				if(borrowers.get(i).getID() == id)
				{
					stdErr.println(borrowers.get(i).toString());
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private static void removeBorrower() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<borrowers.size();i++)
			{
				if(borrowers.get(i).getID() == id)
				{
					borrowers.remove(i);
					stdErr.println("deleted");
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void lookUpLoan() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<loans.size();i++)
			{
				if(loans.get(i).getID() == id)
				{
					stdErr.println(loans.get(i).toString());
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private static void removeLoan() 
	{
		try
		{
			stdErr.println("please enter your ID number");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<loans.size();i++)
			{
				if(loans.get(i).getID() == id)
				{
					loans.remove(i);
					stdErr.println("deleted");
				}
				else
				{
					stdErr.println("cannot find out");
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
