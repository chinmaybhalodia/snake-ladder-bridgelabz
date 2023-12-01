public class Game {
    int position;

    public Game() {
        this.position = 0;
    }

    // UC2: roll dice function
    public static int rollDice() {
        return (int) Math.floor(Math.random() * 7);
    }
}
