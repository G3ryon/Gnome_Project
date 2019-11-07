import java.util.*;

/**
 *
 */
public class Handicaped extends Gnome {

    public double PriceMultiplier = 0.5;

    /**
     * Default constructor
     */
    public Handicaped(int id, String name, int age, String skincolour,String size,String build,String sex) {
        super(id, name, age, skincolour, size, build, sex);
    }

    public Handicaped() {
        super(0, null, 0, null, null, null, null);
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
        this.Sex = RandomGnomeString(givenList);
    }

    public void Work() {
        // TODO implement here
    }

}