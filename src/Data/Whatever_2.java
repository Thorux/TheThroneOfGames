package Data;

import java.util.Scanner;

import static Helpers.Artists.BeginSession;

/**
 * Created by Anders on 21-02-2015.
 */
public class Whatever_2 {

    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static int[][] board = new int[6][7];
    public static int turn = 2;

    public static void main(String[] args) {
        //BeginSession();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = 0;
            }
        }

        //PrintBoard();
        Play();
    }

    public static void Play() {
        boolean playing = true;
        PrintBoard();

        while (playing) {
            System.out.println("Please enter a row and a column: ");
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            board[row][col] = turn;
                /*
                * if (GameOver(row, col)) {
                * playing = false;
                * System.out.println("Game over! Player " + turn + " wins!");
                * }
                * */
            PrintBoard();
            if (turn == 2) {
                turn = 5;
            }
            else {
                turn = 2;
            }
        }
    }

    public static void PrintBoard() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " | ");

            }
        }
        System.out.println();

    }

    public static boolean GameOver(int rMove, int cMove) {


        return false;
    }


}
