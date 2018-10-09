/**
 * The Deck class represents a stack of cards. 
 */
public class Deck {
	private Card[] Deck;
	private Card card;
	private Card tempCard;
	private int topOfDeck;
	private int numberCard;
	
	/**
	 * constructor - makes a deck containing one card for every 
	 * combination of features and sets the topOfDeck to the index
	 * of the last card.
	 */
	public Deck()
	{
		numberCard = 0;
		Deck = new Card [81];
		topOfDeck = 0;
		
		for (int d = 0; d < 3; d++){
			for (int i = 1; i < 4; i++){
				for (int e = 1; e < 4; e++){
					for (int s = 0; s < 3; s++){
						card = new Card(d,i,e,s);
						Deck[numberCard] = card;
						numberCard++;
						// is there a better way to do this. I feel awful -Peter
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
		
		this.outOfCards();
		c = Deck[topOfDeck];
		topOfDeck += 1;

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
		for (int i = 0; i < 81; i++) {
			SwapCards(i,(int)(Math.random()*81));
		}
		topOfDeck = 0;
		//--------------------
		
	}
	public void SwapCards(int cardLocation1,int cardLocation2){
		Card tempCard = Deck[cardLocation1];
		Card tempCard2 = Deck[cardLocation2];
		Deck[cardLocation1] = tempCard2;
		Deck[cardLocation2] = tempCard;
	}
	
	/**
	 * outOfCards - determines whether the "top of deck" has extended beyond the end of the Deck.
	 * @return - boolean; whether the top of deck is past the end of the deck
	 */
	public boolean outOfCards()
	{
		boolean pastEndOfDeck = false;
		//--------------------
		if(topOfDeck > 80) {
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
		for(int i = 0; i < 81; i ++) {
			result += Deck[i].toString();
			result += " ";
		}
		
		//--------------------
		return result;
	}
	
}
