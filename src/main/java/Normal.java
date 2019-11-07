import java.util.*;

/**
 *
 */
public class Normal extends Gnome {

    public float PriceMultiplier = 1;

    /**
     * Default constructor
     */
    public Normal(int id, String name, int age, String skincolour,String size,String build,String sex,double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    public Normal() {
        super(0, null, 0, null, null, null, null,0);
    }

    @Override
    public void setAge(){
        List<Integer> givenList = Arrays.asList(6, 7, 8);
        this.Age = RandomGnomeInt(givenList);
    }

    @Override
    public void setSkinColour() {
        List<String> givenList = Arrays.asList("red", "blue", "white");
        this.SkinColour = RandomGnomeString(givenList);
    }

    @Override
    public void setSize(){
        List<String> givenList = Arrays.asList("small", "medium", "large");
        this.Size = RandomGnomeString(givenList);
    }

    @Override
    public void setBuild() {
        List<String> givenList = Arrays.asList("normal", "thick");
        this.Build = RandomGnomeString(givenList);
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

    public void Work() {
        // TODO implement here
    }

}