/**
 * Created by Feras on 7/10/2017.
 */
public class PlayerRock extends Player {

    public PlayerRock(String name) {
        this.setPlayerPick(Roshambo.ROCK);
        this.setName(name);
    }

    @Override
    public Roshambo generateRoshambo(String userChoice) {
        return Roshambo.ROCK;
    }
}
