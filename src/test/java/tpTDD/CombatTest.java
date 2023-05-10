package tpTDD;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CombatTest {

	@Test
	void testResoudreCombat() {
		Personnage hero = new Personnage(50,8);
		Personnage ennemi = new Personnage(42,3);
		Combat combat = new Combat(hero,ennemi);
		combat.resoudreCombat();
		assertTrue( hero.getPv()<=0 || ennemi.getPv()<=0 );
	}

}
