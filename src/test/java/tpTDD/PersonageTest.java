package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonageTest {

	@Test
	void testGetPV() {
		Personnage perso = new Personnage(50, 5);
		assertEquals(50, perso.getPv());
	}

}
