import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	private Deck theDeck();
	
	@Before
	public void setUp() throws Exception {
		theDeck = new Deck();
	}

	@Test
	public void test() {
		int numCards = 0;
		int numCardA = 0;
		int numCardB = 0;
		int numCardC = 0;
		int numCardD = 0;
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
		assertEquals(81,numCards);
		assertEquals(1,numCardsA);
		assertEquals(1,numCardsB);
		assertEquals(1,numCardsC);
		assertEquals(0,numCardsD);
		theDeck.shuffle(); // shuffling should reset the available cards.
		assertFalse(theDeck.outOfCards());
		
	}

}
