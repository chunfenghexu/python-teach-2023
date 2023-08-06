package overclass;

public class Score {

	private int totalScore;
	private int id;
	public Score()
	{
		
	}
	public Score(int id,int totalScore) {
		this.totalScore=totalScore;
		this.id=id;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
