// Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
//Using the Card describe() method when each card is flipped illustrates the game play.
//Printing the winner of each turn adds interest.  
//Printing the updated score after each turn shows game progression.
//At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

package war;

public class App {

	public static void main(String[] args) {
		
		 //Instantiate a Deck and two Players, call the shuffle method on the deck.//
		Deck deck = new Deck();
		Player Emmett = new Player();
		Player Oliver = new Player();		
		deck.shuffle();  
		
		//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.//		
		for (int i = 1; i <= 52; i++) {
			if (i%2 == 0) {
				Emmett.hand.add(deck.draw()); 
			} else { 
				Oliver.hand.add(deck.draw());
			}
		}
		System.out.println(Emmett.hand);
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.//				
		for (int i = 1; i <= 26; i++) {
			 Card emmettCard = Emmett.flip();
			 Card oliverCard = Oliver.flip();
			System.out.println("Emmett drew a " + Emmett.hand.get(0) + ".");
			System.out.println("Oliver drew a " + Oliver.hand.get(0) + "."); 
			
			//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.//

			
			if (emmettCard.getValue() > oliverCard.getValue()) {
				Emmett.score += 1;
				Emmett.hand.remove(0);
				Oliver.hand.remove(0);
				System.out.println("Emmett earned a point!");
				System.out.println("Emmett's score is now " + Emmett.score + " and Oliver's score is now " + Oliver.score + ".");
			} else if (oliverCard.getValue() > emmettCard.getValue()) {
				Oliver.score += 1;
				Emmett.hand.remove(0);
				Oliver.hand.remove(0);
				System.out.println("Oliver earned a point!");
				System.out.println("Emmett's score is now " + Emmett.score + " and Oliver's score is now " + Oliver.score +".");
			} else {
				Emmett.hand.remove(0);
				Oliver.hand.remove(0);
				System.out.println("That round was a draw.");
				System.out.println("The score has not changed.");
			}
			System.out.println("------------------------------------");
		}

		
		
		//After the loop, compare the final score from each player. //	
		//Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.//
		
		System.out.println("Emmett ended with a score of " + Emmett.score + "\nOliver ended with a score of " + Oliver.score );
		if (Emmett.score > Oliver.score) {
			System.out.println("Emmett won the game!");
		} else if (Oliver.score > Emmett.score) {
			System.out.println("Oliver won the game!");
		} else {
			System.out.println("The game ended in a tie.");
		}
	}
}
