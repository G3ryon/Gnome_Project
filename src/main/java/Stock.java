
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
            instance = new Stock();
        }
        return instance;
    }

    /**
     * List of the Gnomes in stock
     */
    public List<Gnome> listGnomeStock;

    /**
     * List of the Gnomes currently rented
     */
    public List<Gnome> listRentedGnome;


    /**
     * Add a Gnome to the Stock
     */
    public void addGnome(Gnome gnome) {
        // TODO implement here
        listGnomeStock.add(gnome);
    }

    /**
     * Remove a Gnome from the Stock
     */
    public void delGnome(Gnome gnome) {
        // TODO implement here
        for (Iterator<Gnome> iter = listGnomeStock; iter.hasNext(); ) {
            Gnome a = iter.next();
            if (iter == gnome) {
                iter.remove();
            }
        }
    }

    /**
     * Move a Gnome from the Stock to the rented list
     */
    public void moveGnome(Gnome gnome) {
        // TODO implement here
        for (Iterator<Gnome> iter = list.listIterator(); iter.hasNext(); ) {
            Gnome a = iter.next();
            if (iter == gnome) {

                iter.remove();
            }
        }
    }
}