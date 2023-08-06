package overclass;

public class EngQuestion extends Question
{
	private String type;
	
	public EngQuestion()
	{
		
	}
	
	public EngQuestion(String ID,String stem,int difficulty,String scoreStandard,int score,String type)
	{
		super(ID,stem,difficulty,scoreStandard,score);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
