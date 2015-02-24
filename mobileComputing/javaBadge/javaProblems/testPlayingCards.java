public class testPlayingCards{

    public static void main(String [] args){

	playingCards jack = new playingCards("Spades", 11);
        System.out.println("You created a Jack of Spades!");
	assert jack.getSuit()=="Spades";
    }
}
