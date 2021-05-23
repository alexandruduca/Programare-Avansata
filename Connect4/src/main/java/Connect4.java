import java.util.Scanner;

public class Connect4 {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private final Player currentPlayer;
    private final Scanner input = new Scanner(System.in);



    public Connect4(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = new Player('N');
    }

    public void play() {
        boolean winner = false;
        boolean draw = false;
        boolean validate;
        int column = 0;
        char turn = 'R';
        System.out.println();
        System.out.println("Welcome to the Connect4 game!");
        System.out.println();

        setNameForPlayers(player1, input);
        System.out.println();
        setNameForPlayers(player2, input);
        System.out.println();

        System.out.println("Have fun and let the game begin!");
        System.out.println();
        while (!winner && !draw) {
            validate = false;
            board.printBoard();
            setCurrentPlayer(currentPlayer, turn);
            System.out.println();
            System.out.print(currentPlayer.getName() + ", please enter a column: ");
            while (!validate) {
                column = input.nextInt();
                validate = validateInput(column);
            }
            addMove(column, turn);
            winner = board.isWinner();
            draw = board.isDraw();
            turn = switchRound(turn);
        }
        System.out.println();
        board.printBoard();
        System.out.println();
        Database database = Database.getInstance();
        PlayerDao playerDao = new PlayerDao(database);
        if (winner) {
            System.out.println(currentPlayer.getName() + " has won!");
            playerDao.create(player1.getName(), player2.getName(), currentPlayer.getName());
        }
        if (draw) {
            System.out.println("It's a draw!");
            playerDao.create(player1.getName(), player2.getName(), "DRAW!");
        }
    }

    public boolean validateInput(int column) {
        // checking if the column is valid
        if (column < 0 || column > board.getColumns() - 1) {
            System.out.print("Invalid column! Please enter a valid column (between 0 and 6): ");
            return false;
        }
        // checking if the column is full
        if (board.grid[0][column] != ' ') {
            System.out.print("This column is full. Please enter another column (between 0 and 6): ");
            return false;
        }
        return true;
    }

    public void addMove(int column, char turn) {
        for (int i = board.getRows() - 1; i >= 0; i--) {
            if (board.grid[i][column] == ' ') {
                board.grid[i][column] = turn;
                break;
            }
        }
    }

    public void setNameForPlayers(Player player, Scanner input) {
        if (player.getColor() == 'R')
            System.out.print("Red, please enter your nickname: ");
        else if (player.getColor() == 'Y')
            System.out.print("Yellow, please enter your nickname: ");
        String name = input.nextLine();
        player.setName(name);
    }

    public void setCurrentPlayer(Player currentPlayer, char turn) {
        if (turn == 'R') {
            currentPlayer.setName(player1.getName());
            currentPlayer.setColor(player1.getColor());
        } else if (turn == 'Y') {
            currentPlayer.setName(player2.getName());
            currentPlayer.setColor(player2.getColor());
        }
    }

    public char switchRound(char turn) {
        if (turn == 'R')
            return 'Y';
        return 'R';
    }

}