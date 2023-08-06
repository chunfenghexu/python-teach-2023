package overclass;

import java.util.List;

public class SeatingChart {
	private Student[][] seats;
	public SeatingChart(List<Student> studentList, int rows, int cols)
	{
		
		int count = 0;
		for(int i=0;i<seat.length;i++)
			for(int j=0;j<seat[i].length;j++)
			{
				if(count<studentList.size())
				{
					seat[i][j]=studentList[count];
					count++;
				}
				else
				{
					seat[i][j]=null;
				}
			}	
			
	}
	
	public int removeAbsentStudents(int allowAbsences)
	{
		int count = 0;
		for(int i=0;i<seat.length;i++)
			for(int j=0;j<seat[i].length;j++)
			{
				if(seat[i][j]!=null &&seat[i][j].getAbsenceCont()>allowedAbsences)
				{
					seat[i][j]=null;
					count++;
				}
			}
		return count;
	}
	
}
