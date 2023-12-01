import java.util.ArrayList;
import java.util.Random;

public class Player {
    String name;
    int position;
    int dice_rolls;
    ArrayList<Integer> positions;

    public Player(String name) {
        this.name = name;
        this.position = 0;
        this.dice_rolls = 0;
        this.positions = new ArrayList<Integer>();
        this.positions.add(0);
    }

    // UC3: function to get next posiion of the player
    // returns true if player got 6 on the dice else false
    public boolean rollDice() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
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

        // UC6: count number of dice rolls of this player.
        this.dice_rolls++;

        // UC6: keep track of every move
        this.positions.add(this.position);

        // return true if player got Ladder, can roll dice again
        return choice == 1;
    }

    // UC6: print all current moves
    public void printMoves() {
        System.out.println("Moves of this game: " + this.positions.toString());
    }
}
