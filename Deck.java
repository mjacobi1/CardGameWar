///////////////////COMPLETE/////////////////

/////////////Fields
//cards (List of Card)
////////////Methods
//shuffle (randomizes the order of the cards)
//draw (removes and returns the top card of the Cards field)
//In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.


package war;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	//cards (List of Card)//
	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			for (String suit : suits) {
				int count = 2;
				for (String name : names) {
					cards.add(new Card(name, suit, count));
					count++;
			
		}
	}
}
	
	//shuffle (randomizes the order of the cards)//
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	//draw (removes and returns the top card of the Cards field)
	public Card draw(){
		Card card = this.cards.remove(0);
		return card;
	}
	
}






