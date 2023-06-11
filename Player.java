////////////COMPLETE ////////////////////////////////


//hand (List of Card)
//score (set to 0 in the constructor)
//name
////////////Methods
//describe (prints out information about the player and calls the describe method for each card in the Hand List)
//flip (removes and returns the top card of the Hand)
//draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//incrementScore (adds 1 to the Player’s score field)

package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String player; //name
	List<Card> hand = new ArrayList<Card>(); //hand (List of Card)
	int score; //score (set to 0 in the constructor)
	
	
	//describe (prints out information about the player and calls the describe method for each card in the Hand List)// 
	public void describe(String player, List<Card> hand, int score) {
		this.player = player;
		this.hand = hand;
		this.score = 0;
	}
	
	//flip (removes and returns the top card of the Hand)//
	public Card flip() {
		Card card = this.hand.get(0);
		return card;
	}	
	
	//draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	//incrementScore (adds 1 to the Player’s score field)//
	public void incrementScore() {
		this.score++;
	}
}
