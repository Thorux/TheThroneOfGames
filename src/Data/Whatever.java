package Data;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Thorux on 21-02-2015.
 */
public class Whatever {

    public static Random rand;
    public static Scanner tastatur;
    public static int max, guess, number, i=1;

    public static void main(String[] args) {
        tastatur = new Scanner(System.in);
        rand = new Random();

        System.out.println("Please enter max value: ");
        max = tastatur.nextInt();
        number = rand.nextInt(max);

        System.out.println("Enter your guess: ");
        while (guess != number) {
            guess = tastatur.nextInt();
            if (guess > number) {
                System.out.println("The guess was too high!");
                i++;
            } else if (guess < number) {
                System.out.println("The guess was too low!");
                i++;
            }
        }
        if (i != 1) {
            System.out.println("You win!!! You spent " + i + " tries!");
        }
        else {
            System.out.println("You win!!! You spent one try!");
        }
    }
}