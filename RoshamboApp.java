import java.time.Duration;
import java.util.Scanner;

/**
 * Created by Feras on 7/10/2017.
 */
public class RoshamboApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("What's your name?");
        String userName = scan.nextLine();
        System.out.println();


        System.out.println(userName + ", get ready to Roshambo!");
        System.out.println("Would you like to play against Jets or Sharks?");


        Player opponent = chooseOpponent(scan); // method that creates the opponent player based on the user string input


        System.out.println("So....ROCK, PAPER, or SCISSORS???");
        String userPick = scan.nextLine();

        PlayerUser humanPlayer = new PlayerUser(userName, userPick, 0);




        String userContinue = "y";
        while (userContinue.equalsIgnoreCase("y")) {
            System.out.println("You chose " + humanPlayer.getPlayerPick());
            System.out.println(opponent.getName() + " chose " + opponent.getPlayerPick());
            decideRound(opponent, humanPlayer);

            System.out.println("Go another round? (y/n)");
            userContinue = scan.nextLine();

            if (userContinue.equalsIgnoreCase("y")) {
                opponent.setPlayerPick(opponent.generateRoshambo(""));

                System.out.println("So....ROCK, PAPER, or SCISSORS???");
                userPick = scan.nextLine();
                humanPlayer.generateRoshambo(userPick);
            }


        }


        tallyWins(opponent, humanPlayer);


    }

    private static void tallyWins(Player opponent, PlayerUser humanPlayer) {
        System.out.println("\nScore:\n" +
                humanPlayer.getName() + ": " + humanPlayer.getTotalWins() + "\n" +
                opponent.getName() + ": " + opponent.getTotalWins());
    }

    private static void decideRound(Player opponent, PlayerUser humanPlayer) {
        if (humanPlayer.getPlayerPick() == opponent.getPlayerPick()) {
            System.out.println("It's a tie!");

        } else if (humanPlayer.getPlayerPick() == Roshambo.ROCK && opponent.getPlayerPick() == Roshambo.SCISSORS) {
            System.out.println("You won!");
            humanPlayer.setTotalWins(humanPlayer.getTotalWins() + 1);
        } else if (humanPlayer.getPlayerPick() == Roshambo.ROCK && opponent.getPlayerPick() == Roshambo.PAPER) {
            System.out.println("You lost.");
            opponent.setTotalWins(opponent.getTotalWins() + 1);


        } else if (humanPlayer.getPlayerPick() == Roshambo.PAPER && opponent.getPlayerPick() == Roshambo.ROCK) {
            System.out.println("You win!");
            humanPlayer.setTotalWins(humanPlayer.getTotalWins() + 1);
        } else if (humanPlayer.getPlayerPick() == Roshambo.PAPER && opponent.getPlayerPick() == Roshambo.SCISSORS) {
            System.out.println("You lost.");
            opponent.setTotalWins(opponent.getTotalWins() + 1);


        } else if (humanPlayer.getPlayerPick() == Roshambo.SCISSORS && opponent.getPlayerPick() == Roshambo.PAPER) {
            System.out.println("You won!");
            humanPlayer.setTotalWins(humanPlayer.getTotalWins() + 1);
        } else if (humanPlayer.getPlayerPick() == Roshambo.SCISSORS && opponent.getPlayerPick() == Roshambo.ROCK) {
            System.out.println("You lost.");
            opponent.setTotalWins(opponent.getTotalWins() + 1);
        }
    }

    private static Player chooseOpponent(Scanner scan) {
        boolean validOpponentChoice = false;
        while (validOpponentChoice == false) {
            String opponentChoice = scan.nextLine();

            if (opponentChoice.equalsIgnoreCase("jets")) {
                PlayerRock jets = new PlayerRock("The Jets", 0);
                System.out.println("You selected Jets!");
                validOpponentChoice = true;
                return jets;


            }
            if (opponentChoice.equalsIgnoreCase("sharks")) {
                PlayerRandom sharks = new PlayerRandom("The Sharks", 0);
                System.out.println("You selected The Sharks");
                validOpponentChoice = true;
                return sharks;


            } else {
                System.out.println("Please type Jets or Sharks ");
                validOpponentChoice = false;

            }
        }
        return null;
    }
}
