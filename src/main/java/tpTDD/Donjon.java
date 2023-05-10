package tpTDD;

import java.util.ArrayList;

public class Donjon {
	
	
	private ArrayList<Personnage> monstres = new ArrayList<Personnage>();
	
	private int score;
	//private Player player;
	
	public Donjon(ArrayList<Personnage> monstres, int score) {
		this.monstres = monstres;
		if (score<0)
			throw new IllegalArgumentException("Cant have negative score");
		this.score = score;
	}

	public ArrayList<Personnage> getMonstres() {
		return monstres;
	}

	public void setMonstres(ArrayList<Personnage> monstres) {
		this.monstres = monstres;
	}

	public int getScore() {
		return score;
		
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	

}
