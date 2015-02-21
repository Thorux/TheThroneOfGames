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
    public static char turn = 'X'

    public static void main(String[] args){
        //BeginSession();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = 0;
            }
        }

        Play();
    }

    public static void Play() {
        boolean playing = true;
        while (playing) {
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            board[row][col] = turn;
        }
    }

    public static void PrintBoard() {
        for (int i = 0; i < 6; i++){
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (j == 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }


    }

    public boolean GameOver(int rMove, int cMove) {

        return false;
    }



}
