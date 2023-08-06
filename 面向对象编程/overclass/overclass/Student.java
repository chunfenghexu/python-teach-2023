package overclass;

import java.util.ArrayList;

public class Student {

	private int ID;
	private String name;
	private TestPaper testPaper = null;
    //ArrayList<TestPaper> testPapers = new ArrayList<TestPaper>();
	public Student()
	{
		
	}
	
	public Student(int ID, String name)
	{
		this.ID =ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return  "   " + this.name;
	}
	// 为特定学生生成试卷
	public void generateTestPaper(){
		// ID 
		this.testPaper = TestPaper.generateTestPaper();
	}
}
