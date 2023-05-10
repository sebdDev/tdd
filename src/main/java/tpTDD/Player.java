package tpTDD;

public class Player {
	
	private Personnage personnage;
	private int score;
	//private Donjon donjon;
	
	
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
	
	public boolean isInDonjon(Donjon donjon) {
		boolean isIn = false;
		if(donjon != null)
			isIn = true;
		return isIn;
	}
	
	public void runDonjon(Donjon donjon) {
				
		for (Personnage ennemi : donjon.getMonstres()) {
			
			Combat combat = new Combat(personnage, ennemi);
			
			combat.resoudreCombat();
		}
		
		if(this.personnage.isAlive()) {
			this.setScore(score + donjon.getScore());
			
		}
			
		
	}

	
}
