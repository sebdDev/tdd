package tpTDD;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Personnage personnage = new Personnage(100,10);
		Player loic = new Player(personnage,0);
		
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(9,3));
		monstres.add(new Personnage(16,4));
		monstres.add(new Personnage(20,5));
		
		Donjon donjon = new Donjon(monstres, 10);
		loic.runDonjon(donjon);
		
		
		if(loic.getPersonnage().isAlive()) {
			System.out.println("hey tu as vaincu "+ donjon.getMonstres().size() + " monstres et tu as "+
					loic.getScore() + " points.");

		}else {
			System.out.println("OMG tu as perdu  ");

		}
		

	}

}
