import java.util.*;

/**
 * 
 */
public abstract class Gnome {

    private int Id;
    protected int Age;
    protected String SkinColour;
    protected String Size;
    protected String Build;
    protected String Sex;
    protected String Name;
    private float Price;
    private int IdSetter = 0;


     /**
     * Default constructor
     */
    public Gnome(int id, String name, int age, String skincolour, String size, String build, String sex) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.SkinColour = skincolour;
        this.Size=size;
        this.Build=build;
        this.Sex=sex;
        //this.Price=this.GetPrice();
    }

    public void setId() {
        this.Id = this.IdSetter;
        IdSetter += 1;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public abstract void setAge();

    public abstract void setSkinColour();

    public abstract void setSize();

    public abstract void setBuild();

    public abstract void setSex();

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getSkinColour(){
        return SkinColour;
    }

    public String getSize() {
        return Size;
    }

    public String getBuild() {
        return Build;
    }

    public String getSex() {
        return Sex;
    }


    /**
     * 
     */
    public void Work() {
        // TODO implement here
    }

    public void Idle() {
        // TODO implement here
    }

    public void HandCrafting() {
        // TODO implement here
    }

//    public float GetPrice() {
////        int price = 0;
////        price += pricemap.get(colour.get(this.SkinColour));
////        price += pricemap.get(sex.get(this.Sex));
////        price += pricemap.get(Build.get(this.Build));
////        price += pricemap.get(Size.get(this.Size));
//
//        return price ;
//    }

}