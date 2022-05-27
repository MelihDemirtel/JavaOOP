public class FootballPlayer {
	
	private int no;
	private String name;
	private int minutes;
	private boolean inPlay;
	private int numberOfGoals;
	
	public int getNumberOfGoals() {
		return numberOfGoals;
	}
	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	public boolean isInPlay() {
		return inPlay;
	}
	public void setisInPlay(boolean inPlay) {
		this.inPlay = inPlay;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
