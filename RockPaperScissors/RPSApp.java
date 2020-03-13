package RockPaperScissors;
import java.util.Scanner;
import java.util.Random;
public class RPSApp {
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
        Random random = new Random();
        System.out.println("Welcome to the Rock Paper Scissors game!");
        System.out.println("Starting the game...");
        System.out.println("Good luck!");
        int choice, randomChoice;
        do {
            System.out.println("Choose your move: \n01: Rock\n02: Paper\n03: Scissors\n0 to quit.");
            choice = input.nextInt();
            randomChoice = (int) (Math.random() * 3) + 1;
            if (randomChoice == choice) { System.out.println("It's a tie!"); }
            else if (choice == 1) {
                if (randomChoice == 2) { System.out.println("Paper eats rock. You lose."); }
                else if (randomChoice == 3) { System.out.println("Rock crushes scissors. You win!"); }
            }
            else if (choice == 2) {
                if (randomChoice == 1) { System.out.println("Paper eats rock. You win!"); }
                else if (randomChoice == 3) {
                    System.out.println("Scissor cuts paper. You lose.");
                }
            }
            else if (choice == 3) {
                if (randomChoice == 2) {
                    System.out.println("Scissor cuts paper. You win!");
                }
                else if (randomChoice == 1) {
                    System.out.println("Rock crushes scissors. You lose.");
                }
            }
        } while(choice == 1 || choice == 2 || choice == 3);
        System.out.print("***********************"
                        + "\n  Thanks for playing." +
                         "\n***********************" ); }
}