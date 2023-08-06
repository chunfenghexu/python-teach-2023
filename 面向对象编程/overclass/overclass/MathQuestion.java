package overclass;

public class MathQuestion extends Question
{
	private String picAddress;
	
	public MathQuestion()
	{
		
	}
	
	public MathQuestion(String ID,String stem,int difficulty,String scoreStandard,int score,String picAddress)
	{
		super(ID,stem,difficulty,scoreStandard,score);
		this.picAddress = picAddress;
	}

	public String getPicAddress() {
		return picAddress;
	}

	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}
}
