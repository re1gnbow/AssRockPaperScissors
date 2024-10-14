import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            String playerA = "";
            String playerB = "";

            // Get a valid move from player A
            while (!isValidMove(playerA)) {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = scanner.nextLine().toUpperCase();
            }

            // Get a valid move from player B
            while (!isValidMove(playerB)) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = scanner.nextLine().toUpperCase();
            }

            // Determine and display the result
            determineWinner(playerA, playerB);

            // Prompt to play again
            System.out.print("Do you want to play again? (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            if (!response.equals("Y")) {
                playAgain = false;
            }
        }
        scanner.close();
    }

    // Method to check if the move is valid
    public static boolean isValidMove(String move) {
        return move.equals("R") || move.equals("P") || move.equals("S");
    }

    // Method to determine and display the winner
    public static void determineWinner(String playerA, String playerB) {
        if (playerA.equals(playerB)) {
            System.out.println("It's a tie! Both chose " + playerA);
        } else if (playerA.equals("R") && playerB.equals("S")) {
            System.out.println("Rock breaks Scissors. Player A wins!");
        } else if (playerA.equals("S") && playerB.equals("P")) {
            System.out.println("Scissors cuts Paper. Player A wins!");
        } else if (playerA.equals("P") && playerB.equals("R")) {
            System.out.println("Paper covers Rock. Player A wins!");
        } else if (playerB.equals("R") && playerA.equals("S")) {
            System.out.println("Rock breaks Scissors. Player B wins!");
        } else if (playerB.equals("S") && playerA.equals("P")) {
            System.out.println("Scissors cuts Paper. Player B wins!");
        } else if (playerB.equals("P") && playerA.equals("R")) {
            System.out.println("Paper covers Rock. Player B wins!");
        }
    }
}
