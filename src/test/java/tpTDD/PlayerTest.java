package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void testCheckPlayerPersonnage() {
		Personnage perso = new Personnage(50, 5);
		Player player1 = new Player(perso, 100);

		
		assertEquals(perso, player1.getPersonnage());
	}
	
	//aprés live coding
	@Test
	void testCheckPlayerScore() {
		Personnage perso = new Personnage(50, 5);
		Player player1 = new Player(perso, 100);

		
		assertEquals(100, player1.getScore());
	}
	
	@Test
	void testPlayerIsInDonjon() {
		Personnage perso = new Personnage(50, 5);
		Player player = new Player(perso, 100);
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(20,2));
		monstres.add(new Personnage(20,4));

		Donjon donjon = new Donjon(monstres, 10);
		
		assertTrue(player.isInDonjon(donjon));
	}
	
	@Test
	void testwhenPlayerIsAliveAndRunDonjon() {
		Personnage perso = new Personnage(100, 5);
		Player player = new Player(perso, 0);
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(20,2));
		monstres.add(new Personnage(20,4));

		Donjon donjon = new Donjon(monstres, 10);
		player.runDonjon(donjon);
		assertEquals(donjon.getScore(), player.getScore());
		
	}
	
	@Test
	void testwhenPlayerIsDeadInDonjon() {
		Personnage perso = new Personnage(15, 5);
		Player player = new Player(perso, 0);
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(20,2));
		monstres.add(new Personnage(20,4));

		Donjon donjon = new Donjon(monstres, 10);
		player.runDonjon(donjon);
		assertEquals(0, player.getScore());
		
	}

}
