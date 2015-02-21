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


    public static void main(String[] args){
        BeginSession();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = 0;
            }
        }
    }

    public static void Play() {

    }

    public static void PrintBoard() {

    }





}
