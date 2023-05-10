package tpTDD;

public class Player {
	private Personnage personnage;
	private int score;
	
	public Player(Personnage personnage, int score) {

		this.personnage = personnage;
		this.score = score;
	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
