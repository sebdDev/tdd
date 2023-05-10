package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
