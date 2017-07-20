/**
 * Created by Feras on 7/10/2017.
 */
public abstract class Player {

    private String name;
    private Roshambo playerPick;
    private int totalWins;

    public abstract Roshambo generateRoshambo(String userChoice);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;}



    public Roshambo getPlayerPick() {
        return playerPick;
    }


    public void setPlayerPick(Roshambo pick) {
        this.playerPick = pick;}



    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
}
