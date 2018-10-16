import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Referee class keeps track of a Board, which in turn 
 * holds a Deck of Cards. The Referee is responsible for communicating 
 * the player and the board to make sure that the board is displayed 
 * regularly, the user is asked for "SET"s of cards, and the board is
 * consulted on whether the user is correct before removing them.
 * If the board is empty, or the player gives up, the player can play again.
 * Advanced: if the player is stumped with 12 cards, give him/her the
 * chance to add three more cards.
 */
public class Referee {
	private Board theBoard;
	
	/**
	 * constructor
	 */
	public Referee() {
		theBoard = new Board();
	}
	
	public int getLegalInt(int arg, int lowerBound, int upperBound) {
		boolean legal = false;
		
		while(!legal) {
			if(arg > lowerBound && arg < upperBound) {
				legal = true;
				return arg;
			} else {
			System.out.println("That was not a legal argument, please try again.");
			arg = getInt();
			}
		}
		return 80000;
	}
	/**
	 * playGame - the main game loop for the program.
	 */
	public void playGame()
	{
		int cardsPicked[];
		int people[];
		cardsPicked= new int[3];
		int row;
		int card;
		int whoPlaying = 0;
		int manyPlaying;
		Scanner nameAsker;
		nameAsker = new Scanner(System.in);
		boolean playingGame = true;

		// TODO: write the Referee's playGame method.
		System.out.println("Playing game."); // placeholder code

		System.out.println("How many People are playing");
		
		
		
		manyPlaying = getLegalInt(getInt(), 0, 100);
		
		people = new int[manyPlaying];

		for(int a = 0; a < manyPlaying; a++){
			people[a] = 0;
		}


		while (playingGame == true) {
			System.out.println(theBoard);
			System.out.println("Press 1 when You Find a Set");
			if(getInt() != 1) { 
				System.out.println("Wrong number key pressed! Continuing anyways, though I don't appreciate that.");
			} else {
			}
			System.out.print("Which Player Found The Set? Enter their player number.");
			
			whoPlaying = getLegalInt(getInt(), -1, manyPlaying);

			for (int i = 0; i < 3; i++) {
				System.out.println("Which Row Has a Card?");
				row = getLegalInt(getInt(), -1, 4); //getInt();
				
//				if (row > 4 || row < 0){
//					System.out.println("Number too big or too small.");
//					row = getInt();
//				}
				
				System.out.println("Which Card is it in the row");
				card = getLegalInt(getInt(), -1, 3); //getInt();
				
//				if (card > 3){
//					System.out.println("Number too big.");
//					card = getInt();
//				}
				cardsPicked[i] = row * 3 + card;
			}

			if (theBoard.isLegal(theBoard.displayedCards[cardsPicked[0]], theBoard.displayedCards[cardsPicked[1]], theBoard.displayedCards[cardsPicked[2]]) == true) {
				people[whoPlaying]++;
				theBoard.remove3Cards(cardsPicked[0],cardsPicked[1],cardsPicked[2]);
				theBoard.dealThreeCards();
				System.out.println("That was a set!");
			}else{
				System.out.println("Move Not Legal, reprinting the board...");
				System.out.println("");
			}


		}
		for (int k = 0; k< manyPlaying; k++){
			System.out.print("Player "+k+" : "+people[k]);
		}
		System.out.print("Game Over");

	}
	public int getInt()
	{
		Scanner keyboardReader = new Scanner(System.in);
		int result;
		while (true)
		{
			try
			{
				result = keyboardReader.nextInt();
				break; // leave the loop now.
			}
			catch (InputMismatchException nfe)
			{
				System.out.println("Please enter an integer.");
			}
			keyboardReader.next(); // clears any extra characters.
		}
		return result;
	}
}
