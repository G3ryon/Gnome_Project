import java.util.*;
import static java.lang.System.out;
/**
 *
 */
public class Special extends Gnome {

    public double PriceMultiplier = 0.5;
    public List<String> ColourList = Arrays.asList("red", "blue", "white","black","yellow","metis");
    public List<Integer> AgeList = Arrays.asList(5,6,7,8,9,10,11,12,13,14,15);
    public List<String> SizeList = Arrays.asList("extra_small","extra_large","small", "medium", "large");
    public List<String> BuildList = Arrays.asList("thin","obese","normal", "thick");
    public List<String> SexList = Arrays.asList("female", "male","other");
    public List<String> TalkList = Arrays.asList("TIMMYYY","WTF, y avait une voiture sur un toit!!","Il est occupé de loot en plein fight!! DAMNED");

    /**
     * Default constructor
     */
    public Special(int id, String name, int age, String skincolour,String size,String build,String sex, double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    public Special() {
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

    public void Idle() {
        out.println(RandomGnomeString(TalkList));
    }

}