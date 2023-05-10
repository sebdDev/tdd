package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AttackTest {

	@Test
	void testAttack() {
		
		Personnage perso = new Personnage(50, 5);
		Personnage ennemi = new Personnage(50, 5);
		int pvInitialEnnemi = ennemi.getPv();
		perso.attack(ennemi, perso.getPuissanceDegat());
		
		assertEquals(pvInitialEnnemi - perso.getPuissanceDegat() ,ennemi.getPv());
	
	}

}
