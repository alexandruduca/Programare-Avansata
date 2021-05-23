public class Board {
    private final int rows = 6;
    private final int columns = 7;
    public char[][] grid = new char[rows][columns];

    public Board() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                grid[i][j] = ' ';
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == ' ')
                    System.out.print("_");
                else System.out.print(grid[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println(" 0 1 2 3 4 5 6");
    }

    public boolean isWinner() {
        // check for rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 3; j++) {
                if (grid[i][j] != ' ')
                    if (grid[i][j] == grid[i][j + 1] && grid[i][j + 1] == grid[i][j + 2] && grid[i][j + 2] == grid[i][j + 3])
                        return true;
            }
        }

        // check for columns
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] != ' ')
                    if (grid[i][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 3][j])
                        return true;
            }
        }

        // check for main diagonal
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < columns - 3; j++) {
                if (grid[i][j] != ' ')
                    if (grid[i][j] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 2] && grid[i + 2][j + 2] == grid[i + 3][j + 3])
                        return true;
            }
        }

        // check for second diagonal
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 3; j < columns; j++) {
                if (grid[i][j] != ' ')
                    if (grid[i][j] == grid[i + 1][j - 1] && grid[i + 1][j - 1] == grid[i + 2][j - 2] && grid[i + 2][j - 2] == grid[i + 3][j - 3])
                        return true;
            }
        }

        return false;
    }

    public boolean isDraw() {
        int count = 0;
        for (int j = 0; j < columns; j++) {
            if (grid[0][j] != ' ')
                count++;
        }
        return count == columns && !isWinner();
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

}
