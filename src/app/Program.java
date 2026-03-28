package app;

import java.util.Scanner;

import components.Game;
import components.Move;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("=== ROCK PAPER AND SCISSORS ===");
        char tryAgain = 'y';

        do {
            Move playerMove = null;
            while (playerMove == null) {
                System.out.println();
                System.out.print("Enter your move (ROCK/PAPER/SCISSORS): ");
                String input = sc.nextLine().toUpperCase();

                try {
                    playerMove = Move.valueOf(input);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input. Try again.");
                }
            }

            System.out.println();
            System.out.println("You chose " + playerMove);
            Move computerMove = Move.randomMove();
            System.out.println("The computer chose " + computerMove);

            System.out.println();
            System.out.println("Result: " + Game.play(playerMove, computerMove));

            System.out.println();
            System.out.print("Do you want to try again (y/n)? ");
            tryAgain = sc.nextLine().toLowerCase().charAt(0);
        } while (tryAgain != 'n');

        sc.close();
    }
}
