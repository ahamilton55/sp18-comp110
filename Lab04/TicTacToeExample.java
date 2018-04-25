public class TicTacToe {
    public static void main(String[] args) {
    }

    // printBoard will print out the current setup of the board. 
    //
    // Arguments:
    //   board (type: String[][]) - current layout of the board
    //
    // Returns:
    //   Nothing
    //  
    // It should take the current setup and just format it in the following:
    //
    //  1 | 2 | 3 
    // ---+---+---
    //  4 | 5 | 6 
    // ---+---+---
    //  7 | 8 | 9 
    //
    // The board will change as users make move but your code should be able to use
    // the same methods to print out the board as you original create.
    public static void printBoard(String[][] board) {
    }

    // positionFree will check to see if a position on the board is free.
    public static boolean positionFree(String[][] board, int choice) {
        return false;
    }

    // insertMove will insert the player's choice onto the board
    //
    // Arguments:
    //   board  (type: String[][]) - current layout of the board
    //   player (type String) - either "X" or "O" for the current player making the move
    //   choice (type: int) - a number between 1 and 9 to chose the placement on the board
    //
    // Returns:
    //   String[][]
    //
    // You should be able to place the move by determining the row and column from
    // the choice provided by the user.
    //
    // After inserting the user's move, return the board back to the caller.
    public static String[][] insertMove(String[][] board, String player, int choice) {
        return board;
    }

    // checkWin will determine whether a user has won with the currently layout of the board.
    //
    // Arguments:
    //   board (type: String[][]) - current layout of the board
    //
    // Returns:
    //   boolean
    //
    // There are 8 possible ways to win:
    //   - Across each row (3)
    //   - Down each column (3)
    //   - Diagonally from top right to bottom left
    //   - Diagonally from top left to bottom right
    //
    //  We can check these statically but can do it in as little as 4 conditionals.
    //
    // Remember the transitive property of mathematics when dealing with booleans as it
    // will help limit the number of comparisons required. (i.e. a == b, b == c, so a == c).
    //
    // Return back the user a true value if a win has been discovered, otherwise return false.
    public static boolean checkWin(String[][] board) {
        return false;
    }
}