package tpTDD;

public class Combat {
	private Personnage perso1 ;
	private Personnage perso2;
		
	public Combat(Personnage perso1, Personnage perso2) {
		this.perso1 = perso1;
		this.perso2 = perso2;
	}
	
	public void resoudreCombat() {
		
		while (perso1.isAlive() && perso2.isAlive()) {
			perso1.attack(perso2, 10);
			if(perso2.isAlive())
			perso2.attack(perso1, 10);
		}
		System.out.println(perso1.getPv());
		System.out.println(perso2.getPv());
	}

}
