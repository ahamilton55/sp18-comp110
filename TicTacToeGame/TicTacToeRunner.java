import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        TicTacToeGame game;
        Scanner in = new Scanner(System.in);
        int player = 0;
        boolean compPlayer = false, win = false;

        System.out.print("How many players? ");
        int numOfPlayers = in.nextInt();

        if (numOfPlayers == 1) {
            game = new TicTacToeGame("O");
            compPlayer = true;
        } else {
            game = new TicTacToeGame();
        }

        System.out.println();
        System.out.println("Player X goes first!");
        System.out.println();

        for (int i = 0; i < 9; i++) {
            int choice = -1;
            player = i % 2;
            
            game.printBoard();

            boolean choose = true;

            if (compPlayer && player == 1) {
                game.computerMove();
            } else {
                while (choose) {
                    System.out.println();
                    System.out.printf("Player %s, please pick a space: ", game.players[player]);
                    choice = in.nextInt();
                    System.out.println();

                    if (!game.positionFree(choice)) {
                        System.out.println("Invalid choice, position already taken! Please select an available position.");
                        continue;
                    }
                    choose = false;
                    game.insertMove(game.players[player], choice);
                }
            }

            if (game.checkWin()) {
                win = true;
                break;
            }
        }

        game.printBoard();
        System.out.println();

        if (win) {
            System.out.printf("Player %s wins!\n", game.players[player]);
        } else {
            System.out.println("Draw. No winner!");
        }

        in.close();
    }
}