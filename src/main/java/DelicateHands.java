import java.util.*;

/**
 *
 */
public class DelicateHands extends Gnome {

    public float PriceMultiplier = 2;

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
        // TODO implement here
    }

}