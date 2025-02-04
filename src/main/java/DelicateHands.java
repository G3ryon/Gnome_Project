import java.util.*;

import static java.lang.System.out;

/**
 *
 */
public class DelicateHands extends Gnome {

    public float PriceMultiplier = 2;
    public List<String> ColourList = Arrays.asList("red", "blue", "white","black","yellow","metis");
    public List<Integer> AgeList = Arrays.asList(5,6,7,8,9,10,11,12,13,14,15);
    public List<String> SizeList = Arrays.asList("extra_small","extra_large","small", "medium", "large");
    public List<String> BuildList = Arrays.asList("thin","obese","normal", "thick");
    public List<String> SexList = Arrays.asList("female", "male","other");
    private List<String> TalkList = Arrays.asList("J'ai fait une echarpe brodée", "J'ai fait une venus de milo","J'ai fait une replique de Mona Lisa");

    /**
     * Default constructor
     */
    public DelicateHands(int id, String name, int age, String skincolour,String size,String build,String sex,double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    public DelicateHands() {
        super(0, null, 0, null, null, null, null, 0);
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

    public void HandCrafting() {
        out.println(this.Name + " dit " +RandomGnomeString(TalkList));
    }

}