public class playingCards {
    
    private String suit;
    private int value;

    public playingCards(String suitInit, int valueInit) {
	
	suit = suitInit;
	value = valueInit;

    }

    public String getSuit(){
	
	return suit;	
    }

    public int getValue(){

	return value;

    }

}
