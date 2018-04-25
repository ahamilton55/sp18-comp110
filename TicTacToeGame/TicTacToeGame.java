import java.util.Random;

public class TicTacToeGame {
    String[][] board = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
    String[] players = {"X", "O"};
    String computerPlayer;

    public TicTacToeGame() {}

    public TicTacToeGame(String computerPlayer) {
        this.computerPlayer = computerPlayer;
    }

    public void printBoard() {
        System.out.printf(" %s | %s | %s \n", this.board[0][0], this.board[0][1], this.board[0][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n", this.board[1][0], this.board[1][1], this.board[1][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n", this.board[2][0], this.board[2][1], this.board[2][2]);
        System.out.println();
    }

    private int getRow(int choice) {
        return (choice -1) / 3;
    }
    private int getCol(int choice) {
        return (choice -1) % 3;
    }
    public boolean positionFree(int choice) {
        int row = getRow(choice);
        int col = getCol(choice);

        if (this.board[row][col].equals("X") || this.board[row][col].equals("O")) {
            return false;
        }
        return true;
    }

    public void insertMove(String player, int choice) {
        int row = getRow(choice);
        int col = getCol(choice);

        this.board[row][col] = player;
    }

    public boolean checkWin() {
        for(int i = 0; i < 3; i++) {
            // Check rows
            if (this.board[i][0].equals(this.board[i][1]) && this.board[i][1].equals(this.board[i][2])) {
                return true;
            }

            // Check columns
            if (this.board[0][i].equals(this.board[1][i]) && this.board[1][i].equals(this.board[2][i])) {
                return true;
            }
        }

        // Check from top right to bottom left
        if (this.board[0][0].equals(this.board[1][1]) && this.board[1][1].equals(this.board[2][2])) {
            return true;
        }

        // Check from top left to bottom right
        if (this.board[0][2].equals(this.board[1][1]) && this.board[1][1].equals(this.board[2][0])) {
            return true;
        }
        
        return false;
    }

    public void computerMove() {
        int choice = generateChoice();
        insertMove(this.computerPlayer, choice);
    }

    public int generateChoice() {
        int[] nums = new int[9];
        int total = 0;
        Random rand = new Random();

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                int val = 0;
                try {
                    val = Integer.valueOf(this.board[i][j]);
                } catch (Exception e) {
                    continue;
                }
                if (positionFree(val)) {
                    nums[total] = val;
                    total++;
                }
            }
        }

        int choice = rand.nextInt(total);
        return nums[choice];
    }
}