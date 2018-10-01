/**
 * the Card class represents a card in the Set game - it consists 
 * of 1-3 groups of 1-3 characters, which come in 3 varieties. Each of the
 * groups is surrounded by one of three bracket types. On any one card, 
 * there is only one character, but it is likely to be repeated.
 * Likewise, there might be several groups of characters, but each group 
 * on a given card will have the same number of cards.
 * The following are legal cards:
 *    [**] [**] [**] (3 groups of 2 stars in square brackets)
 *    <o> <o> (2 groups of 1 circle in angle brackets)
 *    {•••} (1 group of 3 dots in curly brackets)
 *    <•••> <•••> <•••> (3 groups of three dots in angle brackets)
 * (An analogy might be working out on a nautilus machine - you do a 
 * certain number of sets of a certain number of reps of some weight,
 * on varying machines.)
 * The following are NOT legal cards:
 *    {*} {**} {***} (different size groups on one card)
 *    [o] [•] [•] (different shapes on one card)
 *    <**> <**> {**} (different brackets on one card)
 *    [oooo] [oooo] (more than three in a group)
 *    <•> <•> <•> <•> (more than three groups)
 *      (empty card)
 * So each card can be represented by four numbers - the number of groups, 
 * the size of the groups, which bracket and which icon you are using.
 * Each of these numbers has 3 possible values.
 * Question: how many legal combinations are there???
 */
public class Card {

	// TODO: decide which private member variables the Card class requires and declare them here.

	/**
	 * constructor - given four values, initialize the card.
	 * @param whichIcon: a number 0-2, where 0 means "*"; 1 means "o"; and 2 means "•" 
	 * @param groupSize
	 * @param numGroups
	 * @param whichBracket: a number 0-2, where 0 means "[ ]"; 1 means "{ }"; and 2 means "< >"
	 */
	
	 private int whichIcon;
	 private int groupSize;
	 private int numGroups;
	 private int whichBracket;
	
	 public Card(int whichIcon, int groupSize, int numGroups, int whichBracket)
	 {
		this.whichIcon = whichIcon;
		this.groupSize = groupSize;
		this.numGroups = numGroups;
		this.whichBracket = whichBracket;
		
	 }
	
	 // TODO: write accessors for all member variables. In this case,
	 //       you shouldn't write modifiers; a Card never changes.
	 public int giveIcon() {
		 return this.whichIcon;
	 }
	 
	 public int giveGroupSize() {
		 return this.groupSize;
	 }
	 
	 public int giveNumGroups() {
		 return this.numGroups;
	 }
	 
	 public int giveBracket() {
		 return this.whichBracket;
	 }
	 
	 
	/**
	 * toString - get a visual description of this card.
	 * @return the string describing this card, like "<•••>"
	 */
	public String toString() {
		String card = "";
		
		for(int i = 0; i < numGroups; i ++) {
			String cardGroup;
			if(i == 0) {
				cardGroup = "";
			} else {
				cardGroup = " ";
			}
			if(whichBracket == 0) {
				cardGroup += "[";
				for(int j = 0; j < groupSize; j++) {
					if(whichIcon == 0) {
						cardGroup += "*";
					}
					if(whichIcon == 1) {
						cardGroup += "o";
					}
					if(whichIcon == 2) {
						cardGroup += "•";
					}
				}
				cardGroup += "]";
			}
			if(whichBracket == 1) {
				cardGroup += "{";
				for(int j = 0; j < groupSize; j++) {
					if(whichIcon == 0) {
						cardGroup += "*";
					}
					if(whichIcon == 1) {
						cardGroup += "o";
					}
					if(whichIcon == 2) {
						cardGroup += "•";
					}
				}
				cardGroup += "}";
			}
			if(whichBracket == 2) {
				cardGroup += "<";
				for(int j = 0; j < groupSize; j++) {
					if(whichIcon == 0) {
						cardGroup += "*";
					}
					if(whichIcon == 1) {
						cardGroup += "o";
					}
					if(whichIcon == 2) {
						cardGroup += "•";
					}
				}
				cardGroup += ">";
			}
			card += cardGroup;
		}
		return card;
	}
	
	
}
