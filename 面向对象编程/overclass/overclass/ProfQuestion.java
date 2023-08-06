package overclass;

public class ProfQuestion extends Question
{
	private String description;
	private String body;
	private String picAddress;
	
	public ProfQuestion(String ID,String stem,int difficulty,String scoreStandard,int score,String description,String body,String picAddress)
	{
		super(ID,stem,difficulty,scoreStandard,score);
		this.description = description;
		this.body = body;
		this.picAddress = picAddress;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getBody() 
	{
		return body;
	}
	public void setBody(String body)
	{
		this.body = body;
	}
	public String getPicAddress() 
	{
		return picAddress;
	}
	public void setPicAddress(String picAddress) 
	{
		this.picAddress = picAddress;
	}
	
	
}
