import java.util.Scanner;
import java.util.Random;

public class TicTacToeV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] board = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };

        int player = 0;
        boolean computerPlayer = false;
        boolean win = false;
        String[] players = {"X", "O"};

        System.out.print("How many players? ");
        int numOfPlayers = in.nextInt();

        if (numOfPlayers == 1) {
            System.out.println("Computer playing for O");
            computerPlayer = true; 
        }

        System.out.println();
        System.out.println("Player X goes first!");
        System.out.println();

        for (int i = 0; i < 9; i++) {
            int choice = -1;
            player = i % 2;
            
            printBoard(board);

            boolean choose = true;

            if (computerPlayer && player == 1) {
                choice = generateChoice(board);
                System.out.println();
                System.out.printf("Computer picks, %d\n", choice);
                System.out.println();
            } else {
                while (choose) {
                    System.out.println();
                    System.out.printf("Player %s, please pick a space: ", players[player]);
                    choice = in.nextInt();
                    System.out.println();

                    if (!positionFree(board, choice)) {
                        System.out.println("Invalid choice, position already taken! Please select an available position.");
                        continue;
                    }
                    choose = false;
                }
            }

            board = insertMove(board, players[player], choice);

            if (checkWin(board)) {
                win = true;
                break;
            }
        }

        printBoard(board);
        System.out.println();

        if (win) {
            System.out.printf("Player %s wins!\n", players[player]);
        } else {
            System.out.println("Draw. No winner!");
        }

        in.close();
    }

    public static void printBoard(String[][] board) {
        System.out.printf(" %s | %s | %s \n", board[0][0], board[0][1], board[0][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n", board[1][0], board[1][1], board[1][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n", board[2][0], board[2][1], board[2][2]);
    }

    public static boolean positionFree(String[][] board, int choice) {
        int row = (choice - 1) / 3;
        int col = (choice - 1) % 3;

        if (board[row][col] == "X" || board[row][col] == "O") {
            return false;
        }
        return true;
    }

    public static String[][] insertMove(String[][] board, String player, int choice) {
        int row = (choice - 1) / 3;
        int col = (choice - 1) % 3;

        board[row][col] = player;

        return board;
    }

    public static boolean checkWin(String[][] board) {
        for(int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }

            // Check columns
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }

        // Check from top right to bottom left
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        // Check from top left to bottom right
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        
        return false;
    }

    public static int generateChoice(String[][] board) {
        int[] nums = new int[9];
        int total = 0;
        Random rand = new Random();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != "X" && board[i][j] != "O") {
                    nums[total] = Integer.valueOf(board[i][j]);
                    total++;
                }
            }
        }

        int choice = rand.nextInt(total);
        return nums[choice];
    }
}