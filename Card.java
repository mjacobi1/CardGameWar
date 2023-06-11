////////////////////COMPLETE/////////////////

/////////Fields
//value (contains a value from 2-14 representing cards 2-Ace)
//name (e.g. Ace of Diamonds, or Two of Hearts)
////////Methods
//Getters and Setters
//describe (prints out information about a card)


package war;

public class Card {
	String name;//name (e.g. Ace of Diamonds, or Two of Hearts)
	String suit;
	int value; //value (contains a value from 2-14 representing cards 2-Ace)
	
	Card (String name, String suit, int value){
		this.name=name;
		this.suit=suit;
		this.value=value;
	}

	//////////////////Getters and Setters Start//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/////////////////////Getters and Setters End//

	//describe (prints out information about a card)//
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " - " + this.value);
	}
	@Override  // found this online after two days of trying to figure out why my card describe was not working
	public String toString() {
		return name + " of " + suit;
	}
}

