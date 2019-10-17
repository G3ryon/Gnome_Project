
import java.util.*;

/**
 * 
 */
public final class Stock {

    private static Stock instance;

    /**
     * Default constructor
     */
    private Stock() {
    }

    public synchronized static Stock getInstance() {
        if (instance == null)
        {
            instance = new Stock()
        }
        return instance
    }

    /**
     * 
     */
    public void ListGnomeStock<>;

    /**
     * 
     */
    public void ListRentedGnome[ ];



    /**
     * 
     */
    public void AddGnome(int Age, string SkinColour, float Size, String Build, String Sex, String Name, float Price) {
        // TODO implement here
        ListGnomeStock.add(new Gnome(Age, SkinColour, size, Build, Sex, Name, Price));
    }

    /**
     * 
     */
    public void DelGnome() {
        // TODO implement here
    }

    /**
     * 
     */
    public void MoveGnome() {
        // TODO implement here
    }

}