package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CheckDonjon {

	@Test
	void testCheckDonjonContainsPersonnage() {
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(20,2));
		monstres.add(new Personnage(20,4));

		Donjon donjon = new Donjon(monstres, 10);
				
		assertTrue(donjon.getMonstres().size()==2);
	}
	
	//aprés live coding
	@Test
	void testCheckDonjonHasScore() {
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(new Personnage(20,2));
		monstres.add(new Personnage(20,4));

		Donjon donjon = new Donjon(monstres, 10);
				
		assertEquals(10,donjon.getScore());
		
	}
	@Test
	void test_whenScore_ShouldBeNegative() {
		
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			
			public void execute() throws Throwable {
				ArrayList<Personnage> monstres = new ArrayList<Personnage>();
				monstres.add(new Personnage(20,2));
				monstres.add(new Personnage(20,4));
				
				new Donjon(monstres, -1);
			}
		} );

	}
}
