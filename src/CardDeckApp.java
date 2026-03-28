public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("\nSHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("\nHAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
                          "8", "9", "10", "Jack", "Queen", "King"};

        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    private static void displayCards(String[] cards) {
        for (String card : cards) {
            System.out.println(card);
        }
    }

    private static void shuffleDeck(String[] deck) {
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            // swap deck[i] with deck[randomIndex]
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        for (int i = 0; i < count; i++) {
            hand[i] = deck[i];
        }
        return hand;
    }
}
