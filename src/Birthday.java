package src;
import java.util.LinkedList;

/**
 * @author Ayman
 * Birthday card event
 */
public class Birthday extends CardEffect{

    /**
     * Birthday card event is non generic and takes no parameters
     */
    public Birthday() {
        this.cardText = "It's your birthday. Collect £10 from each player";//default card text for testing
    }

    /**
     * £10s is taken from each player other than the current player who receives the total money collected
     * @param currentPlayer target player to receive birthday money
     */
    @Override
    void effect(Player currentPlayer) {
        int payment = 0;
        LinkedList<Player> players = this.board.turnOrder;//get turn order from the board
        for(Player p : players) {
            if(!p.equals(currentPlayer)) {//only take from other players than current
                int temp = p.deductAmount(10);//take £10 from player
                payment += temp;
            }
        }
        currentPlayer.addAction(cardText);//add card text to log
        currentPlayer.payPlayerAmount(payment);//give player the total collected
    }
}
