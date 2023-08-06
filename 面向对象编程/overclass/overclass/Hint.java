package overclass;

public class Hint {
	private String HiddenWord;
	
	public Hint(String HiddenWord)
	{
		this.HiddenWord=HiddenWord;
	}
	
	public String getHint(String hint)
	{
		String hintWord = "";
		for(int i=0;i<hint.length();i++)
		{
			if(hint.substring(i,i+1).equals(HiddenWord.substring(i,i+1)))
				hintWord += hint.substring(i,i+1);
			else if(HiddenWord.indexOf(hint.substring(i,i+1)) != -1)
				hintWord += "+";
			else
				hintWord +="*";
		}
		return hintWord;
	}

}
