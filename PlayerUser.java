import java.util.Scanner;

/**
 * Created by Feras on 7/10/2017.
 */
public class PlayerUser extends Player {

    public PlayerUser(String name, String input, int wins) {
        this.setPlayerPick(generateRoshambo(input));
        this.setName(name);
        this.setTotalWins(wins);
    }

    @Override
    public Roshambo generateRoshambo(String userChoice) {
        if (userChoice.equalsIgnoreCase("rock")) {
            this.setPlayerPick(Roshambo.ROCK);
            return Roshambo.ROCK;

        } else if (userChoice.equalsIgnoreCase("paper")) {
            this.setPlayerPick(Roshambo.PAPER);
            return Roshambo.PAPER;

        } else if (userChoice.equalsIgnoreCase("scissors")) {
            this.setPlayerPick(Roshambo.SCISSORS);
            return Roshambo.SCISSORS;
        }

        return null;
    }


}
