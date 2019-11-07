import java.util.*;

/**
 * 
 */
public class Gnome {

    private int Id;
    private int Age;
    private String SkinColour;
    private float Size;
    private String Build;
    private String Sex;
    private String Name;
    private float Price;

    PriceMap = {
            Colour={
                    blue=69,
                    red=666,
                    white=1,
                    black=1,
                    yellow=0.5,
                    metis=0.75
            },
            Sex={
                    female=5,
                    male=3,
                    other=0.1
            },
            Size={
                    extra_small=0.5,
                    small=2,
                    medium=1,
                    large=0.5,
                    extra_large=0.25
            },
            Build={
                    thin=0.5,
                    normal=1,
                    thick=2,
                    obese=0.25
            },
            Age={
                    less5=0,
                    more5less8=0,
                    more8less12=0,
                    more12=0
            }
    }
     /**
     * Default constructor
     */
    public Gnome(int id,String name,int age,String skincolour,String size,String build,String sex) {
        this.Id = id;
        this.Name = name;
//        this.Age = age;
//        this.SkinColour = skincolour;
//        this.Size=size;
//        this.Build=build;
//        this.Sex=sex;
        this.Price=this.GetPrice();
    }

    public void setId() {
        this.Id
    }

    public void setName(String name)
    {
        this.Name = name;
    }

//    public void setAge(float age)
//    {
//        this.Age = age;
//    }
//
//    public void setSkinColour(String skincolour)
//    {
//        this.SkinColour = skincolour;
//    }
//
//    public void setSize(String size)
//    {
//        this.Size = size;
//    }
//
//    public void setbuild(String build)
//    {
//        this.Build = build;
//    }
//
//    public void setSex(String sex)
//    {
//        this.Sex = sex;
//    }

    public String getName() {
        return Name;
    }

//    public int getAge() {
//        return Age;
//    }
//
//    public String getSkinColour(){
//        return SkinColour;
//    }
//
//    public String getSize() {
//        return Size;
//    }
//
//    public String getBuild() {
//        return Build;
//    }
//
//    public String getSex() {
//        return Sex;
//    }


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

    public float GetPrice() {
        int price = 0;
        price += pricemap.get(colour.get(this.SkinColour));
        price += pricemap.get(sex.get(this.Sex));
        price += pricemap.get(Build.get(this.Build));
        price += pricemap.get(Size.get(this.Size));

        return price ;
    }

}