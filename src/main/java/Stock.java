
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
    public List<Gnome> ListGnomeStock;

    /**
     * List of the Gnomes currently rented
     */
    public List<Gnome> ListRentedGnome;


    /**
     * Add a Gnome to the Stock
     */
    public void AddGnome(Gnome gnome) {
        // TODO implement here
        ListGnomeStock.add(gnome);
    }

    /**
     * Remove a Gnome from the Stock
     */
    public void DelGnome(Gnome gnome) {
        // TODO implement here
        for (Iterator<Gnome> iterator = gnome.listIterator(); iter.hasNext(); ) {
            String a = iter.next();
            if (gnome.ID == id) {
                iter.remove();
            }
        }
    }

    /**
     * Move a Gnome from the Stock to the rented list
     */
    public void MoveGnome(Gnome gnome) {
        // TODO implement here
        for(Iterator<String> iterator = gnome.iterator() ; iterator.hasNext();){
            String current = iterator.next();
            if(current.Gnome.equals(gnome)){
                iterator.remove();
                ListRentedGnome.add(gnome);
                break;
            }
        }
    }
}