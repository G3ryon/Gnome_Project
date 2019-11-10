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
        this.Age = RandomGnomeInt(AgeList);
    }

    @Override
    public void setSkinColour() {
        this.SkinColour = RandomGnomeString(ColourList);
    }

    @Override
    public void setSize(){
        this.Size = RandomGnomeString(SizeList);
    }

    @Override
    public void setBuild() {
        this.Build = RandomGnomeString(BuildList);
    }

    @Override
    public void setSex(){
        this.Sex = RandomGnomeString(SexList);;
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