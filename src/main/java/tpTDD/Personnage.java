package tpTDD;

public class Personnage {
	
	private int pv ;
	private int puissanceDegat ;
	
	public Personnage(int pv, int puissanceDegat) {
		this.pv = pv;
		this.puissanceDegat = puissanceDegat;
				
	}
	
	public int getPv() {
		return pv;
	}
	
	public void setPv(int pv) {
		this.pv = pv;
	}
	
		
	public int getPuissanceDegat() {
		return puissanceDegat;
	}

	public void attack(Personnage ennemi, int degat) {
		
		ennemi.setPv(ennemi.getPv()-this.getPuissanceDegat());
	}
	
	public boolean isAlive() {
		return pv > 0;
	}

}
