/**
 * Created by Feras on 7/20/2017.
 */
public class OpponentFactory {
    public static Player getInstance(String choice) {
        if (choice.equalsIgnoreCase("jets")){
            return new PlayerRock();
        }else if (choice.equalsIgnoreCase("sharks")){
            return new PlayerRandom();
        }
        return null;
    }
}
