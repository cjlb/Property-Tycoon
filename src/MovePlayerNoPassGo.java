package src;

/**
 * Move player to a provided location without performing a pass go check
 * used for any move backwards event or where the card specifies not to pass go or collect
 */
public class MovePlayerNoPassGo extends CardEffect{

    /**
     * Default constructor for Jackson
     */
    public MovePlayerNoPassGo() {

    }
    int destination;

    /**
     * Moves player to location without checking for pass go or collecting £200
     * @param cardText text to display on activation
     * @param destination tile ID to move player to
     */
    public MovePlayerNoPassGo(String cardText, int destination) {
        this.cardText = cardText;
        this.destination = destination;
    }

    /**
     * Moves player to tile location without go check
     *
     * @param currentPlayer player who drew the card and target to be moved
     */
    @Override
    void effect(Player currentPlayer) {
        currentPlayer.setCurrentPos(destination);
        currentPlayer.addAction(cardText);//add text to log
        board.tiles.get(destination).activeEffect(currentPlayer);//triggers tiles effect
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
