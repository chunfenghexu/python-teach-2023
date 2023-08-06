package overclass;

public class Question 
{
	private String ID;
	private String stem;
	private int difficulty;
	private String scoreStandard;
	private int score;
	
	public Question()
	{
		
	}
	public Question(String ID,String stem,int difficulty,String scoreStandard,int score)
	{
		this.setID(ID);
		this.setStem(stem);
		this.setDifficulty(difficulty);
		this.setScoreStandard(scoreStandard);
		this.setScore(score);
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getStem() {
		return stem;
	}
	public void setStem(String stem) {
		this.stem = stem;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public String getScoreStandard() {
		return scoreStandard;
	}
	public void setScoreStandard(String scoreStandard) {
		this.scoreStandard = scoreStandard;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
