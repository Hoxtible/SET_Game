import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	private Deck theDeck;
	
	
	@Before
	public void setUp() throws Exception {
		theDeck = new Deck();
	}

	@Test
	public void test() {
		int numCards = 0;
		int numCardsA = 0;
		int numCardsB = 0;
		int numCardsC = 0;
		int numCardsD = 0;
		theDeck.shuffle();
		while (!theDeck.outOfCards())
		{
			Card c = theDeck.dealCard();
			if ("{*} {*}".equals(c.toString()))
				numCardsA ++;
			if ("<oo> <oo> <oo>".equals(c.toString()))
				numCardsB ++;
			if ("{••} {••}".equals(c.toString()))
				numCardsC ++;
			if ("<o> [••] {***}".equals(c.toString()))
				numCardsD ++;
			numCards ++;
		}
		System.out.println(theDeck);
		assertEquals(81,numCards);
		assertEquals(1,numCardsA);
		assertEquals(1,numCardsB);
		assertEquals(1,numCardsC);
		assertEquals(0,numCardsD);
		theDeck.shuffle(); // shuffling should reset the available cards.
		assertFalse(theDeck.outOfCards());
		
	}

}
