public class App {
    public static void main(String[] args) throws Exception {
        // Starting a new single player game.
        Game game = new Game();
        System.out.println("Current position of player is: " + game.position);

        // roll dice and move the player in game.
        game.rollDice();
        System.out.println("Current position of player is: " + game.position);

        // Play game for single player.
        game.play();
    }
}