package overclass;

import java.io.*;
import java.util.ArrayList;


public class RetestSystem {
    final static int testPaperSize = 10;
    StudentDatabase sdatas = new StudentDatabase();
    QuesDatabase    qdatas = new QuesDatabase();
	private static ArrayList<Question> questions= new ArrayList<Question>();
	private static ArrayList<Student> students= new ArrayList<Student>();
	private static ArrayList<TestPaper> testpapers= new ArrayList<TestPaper>();
	private static ArrayList<Score> score= new ArrayList<Score>();
	private static BufferedReader stdIn= new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdErr= new PrintWriter(System.err,true);
	private static PrintWriter stdOut= new PrintWriter(System.out,true);
	public static void main(String[] args) throws IOException
	{
		String menu = "[0] exit"+"\n"+
					  "[1] Add students to the system"+"\n"+
				      "[2] Display all students"+"\n"+
				      "[3] Display exam paper through student identification code"+"\n"+
				      "[4] Generate random retest papers for designated students"+"\n"+
				      "[5] Enter the retest score of the designated student"+"\n"+
				      "[6] View the total score of the re examination for the specified students"+"\n"+
				      "[7] Check the score of each question in the retest of the designated student"+"\n";
		
		stdErr.println("Please select a function from the menu below > \n");
		stdErr.println(menu);
		int choice = Integer.parseInt(stdIn.readLine());
		while(choice != 0)
		{
			switch(choice)
			{
			case 1:
				addStudent();
				break;
			case 2:
				displayStudents();
				break;
			case 3:
				displayTestPaper();
				break;
			case 4:
				generateTestPaper();
				break;
			case 5:
				enterScore();
				break;
			case 6:
				displayTotalScore();
				break;
			case 7:
				checkScore();
				break;
			}
			stdErr.println(menu);
			choice = Integer.parseInt(stdIn.readLine());
		}

	}
	private static void checkScore() {
		for(int i=100;i>0;i--)
		{
			for(int j=0;j<score.size();j++)
			{
				if(score.get(j).getTotalScore()==i)
				{
						stdErr.println("Student name : " +students.get(j).getName() +"\n"+"TotalScore: "+ score.get(j).getTotalScore());
				}
				
			}
			
		}
		
	}
	private static void displayTotalScore() {
		try
		{
			stdErr.println("please enter student's ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			for(int i=0;i<score.size();i++)
			{
				if(score.get(i).getId() == id)
				{
					stdErr.println("Student name : " +students.get(i).getName() +"\n"+"TotalScore: "+ score.get(i).getTotalScore());
				}
			}
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	private static void enterScore() {
		try
		{
			stdErr.println("please enter student's ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score1 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score2 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score3 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score4 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score5 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score6 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score7 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score8 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score9 = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter the first question's score >");
			int score10 = Integer.parseInt(stdIn.readLine());
			int totalScore=score1+score2+score3+score4+score5+score6+score7+score8+score9+score10;
			RetestSystem.score.add(new Score(id,totalScore));
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	private static void generateTestPaper() 
	{
		// 首先得输入

		// 拿到 ID 
		
		// 系统中查询该ID的学生

		// Student
		student.generateTestPaper();
		//int size = testpapers.size();
		//for(int i = 0; i<10; i++)
		//{
		//	int r = (int)(Math.random()*size);
		//	stdErr.println(testpapers.get(r));
		//}
	}
		
		
	
	private static void displayTestPaper() {
		for(int i=0;i<testpapers.size();i++)
		{
				stdErr.println("testpaper" + (i+1) +testpapers.get(i).toString());
		}
		
	}
	private static void displayStudents() 
	{
		for(int i=0;i<students.size();i++)
		{
				stdErr.println("student" + (i+1) +students.get(i).toString());
		}
	}
	private static void addStudent() {
		try
		{
			stdErr.println("please enter your ID number >");
			int id = Integer.parseInt(stdIn.readLine());
			stdErr.println("please enter your name >");
			String name = stdIn.readLine();
			RetestSystem.students.add(
					new Student(id,name));
			stdErr.println("Added one new student");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}}
