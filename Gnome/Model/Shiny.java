
import java.util.*;

/**
 * 
 */
public class Shiny extends Gnome {

    public float PriceMultiplier = 3;
    private int Age;
    private String SkinColour;
    private float Size;
    private String Build;
    private String Sex;
    /**
     * Default constructor
     */
    public Shiny(int id,String name,int age,String skincolour,String size,String build,String sex) {
        super(id, name);
        this.Age = age;
        this.SkinColour = skincolour;
        this.Size = size;
        this.Build  = build;
        this.Sex = sex;
    }

    public void setAge(){
        List<int> givenList = Arrays.asList(6, 7, 8);
        int age = RandomGnome(givenList);
        this.Age = age;
    }

    public void setSkinColour() {
        List<String> givenList = Arrays.asList("red", "blue", "white");
        String skinColour = RandomGnome(givenList);
        this.SkinColour = skinColour;
    }

    public void setSize(){
        List<String> givenList = Arrays.asList("small", "medium", "large");
        int size = RandomGnome(givenList);
        this.Size = size;
    }

    public void setBuild() {
        List<String> givenList = Arrays.asList("normal", "thick");
        String build = RandomGnome(givenList);
        this.Build = build;
    }

    public void setSex(){
        List<String> givenList = Arrays.asList("female", "male");
        int sex = RandomGnome(givenList);
        this.Sex = sex;
    }


    public void RandomGnome(List givenList) {
        Random rand = new Random();

        String gnomeCaracteristic = givenList.get(rand.nextInt(givenList.size()));
        return gnomeCaracteristic;
    }

    public void Idle() {
        // TODO implement here
    }

}