import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest 
{

	Board theBoard;
	@Before
	public void setUp() throws Exception 
	{
		theBoard = new Board();
	}

	@Test
	public void testIsLegal() 
	{
		Card a = new Card(0,1,1,2);
		Card b = new Card(1,1,2,2);
		Card c = new Card(2,1,3,2);
		Card d = new Card(1,2,2,1);
		Card e = new Card(1,3,2,0);
		
		assertTrue(theBoard.isLegal(a, b, c));
		assertTrue(theBoard.isLegal(b, d, e));
		assertFalse(theBoard.isLegal(a, b, d));
		assertFalse(theBoard.isLegal(c, d, e));
		assertFalse(theBoard.isLegal(a, a, a));
		assertFalse(theBoard.isLegal(b, null, c));
	}

	@Test
	public void testGetNumCardsOnBoardAndDeal3() 
	{
		Board secondBoard = new Board();
		assertEquals(12,secondBoard.getNumCardsOnBoard());
		secondBoard.dealThreeCards();
		assertEquals(15,secondBoard.getNumCardsOnBoard());
	}

	@Test
	public void testRemove3AndGetNum()
	{
		//-------------------- 
		// TODO: Insert your code here. 
		// When you have, delete the fail message below.
		
		//--------------------
		fail("you need to write this test.");
	}
	
}
