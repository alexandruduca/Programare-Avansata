public class Main {
    public static void main(String[] args) {
        Player player1 = new Player('R');
        Player player2 = new Player('Y');
        Connect4 game = new Connect4(player1, player2);
        game.play();
//        Database database = Database.getInstance();
//        PlayerDao playerDao = new PlayerDao(database);
//        playerDao.findById(2);
//        playerDao.findById(10);
    }
}