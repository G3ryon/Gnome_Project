import java.util.*;

/**
 * 
 */
public class Shiny extends Gnome {

    public float PriceMultiplier = 3;

    /**
     * Default constructor
     */
    public Shiny(int id, String name, int age, String skincolour,String size,String build,String sex, double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    // void constructor to create new instance without parameters
    public Shiny() {
        super(0, null, 0, null, null, null, null,0);
    }

    @Override
    public void setAge(){
        List<Integer> givenList = Arrays.asList(6, 7, 8);
        int age = RandomGnomeInt(givenList);
        this.Age = age;
    }

    @Override
    public void setSkinColour() {
        List<String> givenList = Arrays.asList("red", "blue", "white");
        String skinColour = RandomGnomeString(givenList);
        this.SkinColour = skinColour;
    }

    @Override
    public void setSize(){
        List<String> givenList = Arrays.asList("small", "medium", "large");
        String size = RandomGnomeString(givenList);
        this.Size = size;
    }

    @Override
    public void setBuild() {
        List<String> givenList = Arrays.asList("normal", "thick");
        String build = RandomGnomeString(givenList);
        this.Build = build;
    }

    @Override
    public void setSex(){
        List<String> givenList = Arrays.asList("female", "male");
        String sex = RandomGnomeString(givenList);
        this.Sex = sex;
    }

    @Override
    public void setPrice() {
        this.Price = calculatePrice(PriceMultiplier);
    }

    public String RandomGnomeString(List<String> givenList) {
        Random rand = new Random();
        String gnomeCaracteristic = givenList.get(rand.nextInt(givenList.size()));
        return gnomeCaracteristic;
    }

    public int RandomGnomeInt(List<Integer> givenList) {
        Random rand = new Random();
        int gnomeCaracteristic = givenList.get(rand.nextInt(givenList.size()));
        return gnomeCaracteristic;
    }

    public void Idle() {
        // TODO implement here
    }

}