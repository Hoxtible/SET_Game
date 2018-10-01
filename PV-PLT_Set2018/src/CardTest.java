import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

	private Card A,B,C,D,E;
	
	@Before
	public void setUp() throws Exception {
		A = new Card(2,3,1,0);
		B = new Card(1,1,1,1);
		C = new Card(2,2,3,1);
		D = new Card(0,1,2,2);
		E = new Card(1,3,2,0);
	}

	@Test
	public void testToString() {
		assertEquals("[•••]",			A.toString());
		assertEquals("{o}",				B.toString());
		assertEquals("{••} {••} {••}", 	C.toString());
		assertEquals("<*> <*>",			D.toString());
		assertEquals("[ooo] [ooo]",		E.toString());
		
		assertNotEquals("<ooo>", 		A.toString());
		assertNotEquals("{oo}", 		B.toString());
		assertNotEquals("",				C.toString());
	}

}
