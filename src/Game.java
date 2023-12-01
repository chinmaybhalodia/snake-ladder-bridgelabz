public class Game {
    Player p1;
    Player p2;
    boolean turn; // true if turn of player 1, else false

    // UC7: made game for two players
    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.turn = true;
    }

    // UC4: function to play the game for two players until win
    public void play() {
        // play until either of the player wins
        while (!nextMove())
            ;
    }

    // function for players to play turn by turn
    // returns true if any player has won, else false
    public boolean nextMove() {
        boolean repeat = false;
        if (turn) {
            repeat = p1.rollDice();
            if (p1.position == 100) {
                System.out.println("Player " + p1.name + " won the game in " + p1.dice_rolls + " moves.");
                p1.printMoves();
                return true;
            }
        } else {
            repeat = p2.rollDice();
            if (p2.position == 100) {
                System.out.println("Player " + p2.name + " won the game in " + p2.dice_rolls + " moves.");
                p2.printMoves();
                return true;
            }
        }

        // Don't swap turn if player got ladder
        if (!repeat)
            turn = !turn;
        return false;
    }
}
