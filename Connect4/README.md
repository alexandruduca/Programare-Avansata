Together with my colleague Miruna Simina-Bogdan, we decided to implement the Connect4 game in Java.
This game is rather simple, yet attractive and it's an old game that implies a lot of focus and maths. For this, the setup is the following:
1. The board, which is a matrix with 6 rows and 7 columns;
2. 2 players each having a color (usually Red and Yellow) that are dropping colored disks over the board. The pieces are introduced from above and fall straight down, occupying the lowest available space within the column.
The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four own disks. If the players occupy all the 42 spots from the matrix and there is no winner, the game will be a draw.

Technologies used:
1. A single client (the game is displayed in the terminal and it is written on the screen which player needs to enter a piece);
2. Scanner (in order to read the nicknames of the players and all the inputs regarding the move);
3. Database (after each game, the result will be stored into a table named "connect4"; the id will represent the game number, player1's name, player2's name, winner's name);
4. Custom exception (for finding a game by id). 

Implementation:
We designed the problem as follows:
1. A Player class that has the attributes "name" and "color";
2. A Player Dao class in order to store the game in the database and find a specific game by id;
3. A Board class that has the grid (matrix with 6 rows and 7 columns); through the constructor the matrix is initiallized with empty spaces, and the class has boolean methods in order to print the board and determine if there is a winner or a draw;
4. A Connect4 class in which the game is designed; through the constructor, the board is initiallized and the players are added to the game by colors. After that, each player will have to enter a nickname and therefore the game will be played. The class has methods to validate an input, add a move to the grid, set the name for players, switch the turn and set the current player.
