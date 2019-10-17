
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
     * List of the Gnomes in stock
     */
    public void ListGnomeStock<>;

    /**
     * List of the Gnomes currently rented
     */
    public void ListRentedGnome[ ];


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
    public void DelGnome(String name) {
        // TODO implement here
        for (Iterator<ListGnomeStock> iterator = gnome.listIterator(); iter.hasNext(); ) {
            String a = iter.next();
            if (gnome.Name == name) {
                iter.remove();
            }
        }
    }

    /**
     * Move a Gnome from the Stock to the rented list
     */
    public void MoveGnome(String name) {
        // TODO implement here
        for(Iterator<ListGnomeStock> iterator = gnome.iterator() ; iterator.hasNext();){
            ListGnomeStock current = iterator.next();
            if(current.Name.equals(name)){
                iterator.remove();
                ListRentedGnome.add(gnome)
                break;
            }
        }
    }
}