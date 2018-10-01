/**
 * The Deck class represents a stack of cards. 
 */
public class Deck {
	private Card[] Deck;
	private int topOfDeck;
	
	/**
	 * constructor - makes a deck containing one card for every 
	 * combination of features and sets the topOfDeck to the index
	 * of the last card.
	 */
	public Deck()
	{
		Deck = new Card[81];
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j ++) {
				for(int k = 0; k < 3; k ++) {
					for(int l = 0; l < 3; l++) {
						Deck[i + (3 * j) + (9 * k) + (27 * l)] = new Card(i, j, k, l);
						
					}
				}
			}
		}
		
	}
	
	/**
	 * dealCard - returns the card at the "top" of the deck, moving the
	 * "top" down one. 
	 * If the "top" is low enough to be past the end of the deck,
	 * then return null.
	 * @return the next card.
	 */
	public Card dealCard()
	{
		Card c = null;
		//--------------------
		c = Deck[topOfDeck];
		topOfDeck += 1;		
		//--------------------
		return c;
	}
	
	/**
	 * shuffle - shuffles the cards in the deck by swapping many times.
	 * resets "top of deck" to the beginning.
	 * Note: no return value; just updates private variables.
	 */
	public void shuffle()
	{
		//--------------------
		// TODO: insert your code here.
		// Hint #1: Remember, (int)(Math.random()*52) will give you an integer from 0..51, inclusive.
		// Hint #2: 52 is not the number you want for this deck.
		topOfDeck = (int)(Math.random()*82);
		//--------------------
		
	}
	
	/**
	 * outOfCards - determines whether the "top of deck" has extended beyond the end of the Deck.
	 * @return - boolean; whether the top of deck is past the end of the deck
	 */
	public boolean outOfCards()
	{
		boolean pastEndOfDeck = false;
		//--------------------
		if(topOfDeck > 81) {
			pastEndOfDeck = true;
			this.shuffle();
			
		}
		
		//--------------------
		return pastEndOfDeck;
	}
	
	
	/**
	 * toString - lists all the cards in the deck.
	 * @return a String with all the cards in it, in the current order, 
	 * with a marker (e.g., "-->" vs. "   ") where the top of the Deck is.
	 */
	public String toString()
	{
		String result = "";
		//--------------------
		// TODO: insert your code here. (optional, but suggested)
		// this is not something you'll use in the game, but might be handy
		//    for debugging.
		
		//--------------------
		return result;
	}
	
}
