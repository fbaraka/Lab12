/**
 * Created by Feras on 7/10/2017.
 */
public abstract class Player {

    private String name;
    private Roshambo playerPick;

    public abstract Roshambo generateRoshambo(String userChoice);

    public String getName() {
        return name;
    }

    public Roshambo getPlayerPick() {
        return playerPick;
    }


    public void setName(String name) {
        this.name = name;}

    public void setPlayerPick(Roshambo pick) {
        this.playerPick = pick;}
}
