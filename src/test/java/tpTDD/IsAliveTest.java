package tpTDD;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IsAliveTest {

	@Test
	void testIsAlive() {
		Personnage perso = new Personnage(001,5);
		assertTrue(perso.isAlive());
	}

}
