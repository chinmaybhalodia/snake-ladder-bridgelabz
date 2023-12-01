import java.util.Random;

public class Game {
    int position;

    public Game() {
        this.position = 0;
    }

    // UC3: function to get next posiion of the player
    public void rollDice() {
        Random random = new Random();
        int dice = random.nextInt(7);
        int choice = random.nextInt(3);

        switch (choice) {
            // Ladder
            case 1:
                // UC5: check for perfect score of 100 at last move
                if (this.position + dice <= 100) {
                    this.position += dice;
                } // else do nothing
                break;

            // Snake
            case 2:
                // UC4: check for lower bound
                if (this.position - dice < 0)
                    this.position = 0;
                else
                    this.position -= dice;
                break;

            // No play in case of 0
            default:
                break;
        }
    }

    // UC4: function to play the game for single player until win
    public void play() {
        while (this.position < 100) {
            this.rollDice();
        }
        System.out.println("Game Over. Player Won!");
    }
}
