/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = {"a", "b", "c"};
        int[] values = {1,2,3};
        String[] suits = {"green", "blue"};
        Deck deck1 = new Deck(ranks, suits, values);
        deck1.shuffle();
        System.out.println(deck1.toString());
    }
}
