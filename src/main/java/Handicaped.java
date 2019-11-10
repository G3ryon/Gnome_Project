import java.util.*;

/**
 *
 */
public class Handicaped extends Gnome {

    public double PriceMultiplier = 0.5;

    /**
     * Default constructor
     */
    public Handicaped(int id, String name, int age, String skincolour,String size,String build,String sex,double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    public Handicaped() {
        super(0, null, 0, null, null, null, null, 0);
    }

    @Override
    public void setAge(){
        List<Integer> givenList = Arrays.asList(5,6,7,8,9,10,11,12,13,14,15);
        this.Age = RandomGnomeInt(givenList);
    }

    @Override
    public void setSkinColour() {
        List<String> givenList = Arrays.asList("red", "blue", "white","black","yellow","metis");
        this.SkinColour = RandomGnomeString(givenList);
    }

    @Override
    public void setSize(){
        List<String> givenList = Arrays.asList("extra_small","extra_large","small", "medium", "large");
        this.Size = RandomGnomeString(givenList);
    }

    @Override
    public void setBuild() {
        List<String> givenList = Arrays.asList("thin","obese","normal", "thick");
        this.Build = RandomGnomeString(givenList);
    }

    @Override
    public void setSex(){
        List<String> givenList = Arrays.asList("female", "male","other");
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