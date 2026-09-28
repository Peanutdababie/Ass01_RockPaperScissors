import java.util.Objects;

public class RockPaperScissors {
    static void main() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        //declarations
            String playerAMove = " ";
            String playerBMove = " ";
            String playAgain = " ";

            boolean validMove = false; //This will be used to check if a move is valid

        //The game is in a do-while loop
        do {
            //Time for the players to make an input
            //Player A (1) Input
            while (!validMove)//Will not proceed until the player makes a valid input, switching validMove to True
            {
                    System.out.println("It's Player 1's turn! Chose a move using R for Rock, " +
                            "P for Paper, and S for Scissors!");
                    playerAMove = input.nextLine();
                    if (playerAMove.equalsIgnoreCase("R") ||
                            playerAMove.equalsIgnoreCase("P") ||
                            playerAMove.equalsIgnoreCase("S")) {
                        validMove = true; //set to true to break from the loop
                    } else {
                        validMove = false;
                        System.out.println("Please enter a valid move R for Rock, P for Paper, or S for Scissors.\n");
                    }
                }

            validMove = false; //sets back to false so it can be used for the next input

            //Player B (2) Input
            while (!validMove) {
                System.out.println("\nIt's Player 2's turn! Chose a move using R for Rock, " +
                        "P for Paper, and S for Scissors!");
                playerBMove = input.nextLine();
                if (playerBMove.equalsIgnoreCase("R") ||
                        playerBMove.equalsIgnoreCase("P") ||
                        playerBMove.equalsIgnoreCase("S")) {
                    validMove = true;
                } else {
                    validMove = false;
                    System.out.println("Please enter a valid move using R for Rock, P for Paper, or S for Scissors.\n");
                }
            }

            //Results
            if (playerAMove.equalsIgnoreCase(playerBMove)) {
                    System.out.println("It's a tie!");

                //Player A (1) win scenarios
                }else if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player 1 wins!");
            }else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors cut Paper! Player 1 wins!");
            }else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Paper eats Rock! Player 1 wins!");
            }

            //Player B (2) win scenarios
            else if (playerBMove.equalsIgnoreCase("R") && playerAMove.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player 2 wins!");
            }else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors cut Paper! Player 2 wins!");
            }else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("R")) {
                System.out.println("Paper eats Rock! Player 2 wins!");
            }


            //Ask the user to play again
            System.out.println("\nPlay Again? [Y/N]");
            validMove = false; //set to false again so the loops don't get skipped
            playAgain = input.nextLine();
        }while (playAgain.equalsIgnoreCase("Y")); //If the user inputs Y (or y) start the loop
        System.out.println("Game Over! \nThanks for playing!");
    }
}
