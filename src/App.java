public class App {
    public static void main(String[] args) throws Exception {
        // Creating two players
        Player player01 = new Player("Player01");
        Player player02 = new Player("Player02");

        // Starting a new two player game.
        Game game = new Game(player01, player02);

        // Play game for two players.
        game.play();
    }
}