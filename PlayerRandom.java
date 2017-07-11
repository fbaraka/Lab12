import java.util.Random;

/**
 * Created by Feras on 7/10/2017.
 */
public class PlayerRandom extends Player {

    //below is the constructor...because it is the same name as the class including the uppercase letters
    public PlayerRandom(String name) {
        this.setPlayerPick(generateRandomRashambo());
        this.setName(name);
    }

    @Override
    public Roshambo generateRoshambo(String userChoice) {
        return generateRandomRashambo();
    }

    private Roshambo generateRandomRashambo() {

        int randNum = (int)(Math.random() * 3);
        switch (randNum){
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                return null;
        }
    }
}



