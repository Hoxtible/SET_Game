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
        int numCardA = 0;
        int numCardB = 0;
        int numCardC = 0;
        int numCardD = 0;
        theDeck.shuffle();
        while (!theDeck.outOfCards())
        {
            Card c = theDeck.dealCard();
            if ("{*} {*}".equals(c.toString()))
                numCardA ++;
            if ("<oo> <oo> <oo>".equals(c.toString()))
                numCardB ++;
            if ("{••} {••}".equals(c.toString()))
                numCardC ++;
            if ("<o> [••] {***}".equals(c.toString()))
                numCardD ++;
            numCards ++;
        }
        assertEquals(81,numCards);
        assertEquals(1,numCardA);
        assertEquals(1,numCardB);
        assertEquals(1,numCardC);
        assertEquals(0,numCardD);
        theDeck.shuffle(); // shuffling should reset the available cards.
        assertFalse(theDeck.outOfCards());

    }

}
