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
                this.position += dice;
                break;

            // Snake
            case 2:
                this.position -= dice;
                break;

            // No play in case of 0
            default:
                break;
        }
    }
}
