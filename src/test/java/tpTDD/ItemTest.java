package tpTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemTest {
	
	@Test
	void testGetName() {
		
		Item item = new Item("toto");
		
		assertEquals("toto", item.getName());
	}

}
