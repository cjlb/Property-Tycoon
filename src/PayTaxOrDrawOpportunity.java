package src;

/**
 * Pay tax or draw opportunity knocks card event
 * Player choice currently text solution in place
 * will need updating onto GUI stage
 */
public class PayTaxOrDrawOpportunity extends CardEffect {

    private int amount;

    /**
     * Default constructor for Jackson
     */
    public PayTaxOrDrawOpportunity() {
    }

    /**
     * Text version of selection, to be updated when GUI elements are in place
     * @param cardText card text to be displayed on activation
     * @param amount amount of tax to be paid
     */
    public PayTaxOrDrawOpportunity(String cardText, int amount) {
        this.cardText = cardText;
        this.amount = amount;
    }

    /**
     * Player selects 1 if they wise to pay the fine and 2 otherwise
     * @param currentPlayer player who drew the card and is target to the fine or drawing a new card
     */
    @Override
    void effect(Player currentPlayer) {
        currentPlayer.addAction(cardText);//add text to log
        if (!currentPlayer.isAiAgent()) {
            if (super.board.payTaxOrDrawOpKnock()) {
                int payment = currentPlayer.deductAmount(amount);
                this.board.taxPot += payment;//add the amount the player paid to the tax pot
            } else {
                this.board.drawOpportunityKnocks().effect(currentPlayer);//draw card and activate it's effect
            }
        } else {//AI decision
            if (currentPlayer.payTaxOrDraw()) {
                currentPlayer.addAction("pay £10");//add text to log
                int payment = currentPlayer.deductAmount(amount);
                this.board.taxPot += payment;//add the amount the player paid to the tax pot
                this.board.updateTaxPot();
            } else {
                currentPlayer.addAction("draw Opportunity Knocks card");//add text to log
                this.board.drawOpportunityKnocks().effect(currentPlayer);//draw card and activate it's effect
            }
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
