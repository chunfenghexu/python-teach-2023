package overclass;

public class Individual {
	private int ID;
	private String name;
	private String phoneNum;
	private String address;
	
	public Individual()
	{
		
	}
	public Individual(int ID, String name)
	{
		this.ID = ID;
		this.name = name;
	}
	public Individual(int ID, String name, String phoneNum, String address)
	{
		this.ID = ID;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public int getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public String getAddress()
	{
		return address;
	}
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum=phoneNum;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	
	public String toString()
	{
		return "ID:" + this.ID + "\n" +"name: " + this.name;
	}

}
