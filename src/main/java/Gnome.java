import java.util.*;


/**
 * 
 */
public class Gnome {

    private int Id;
    private String Age;
    private String SkinColour;
    private String Size;
    private String Build;
    private String Sex;
    private String Name;
    private double Price;


    private static Map<String,Map<String, Double>> PriceMap = new HashMap<String, Map<String, Double>>();
    private static Map<String, Double> Caract = new HashMap<String, Double>();

    static {
        Caract.put("blue",69.0);
        Caract.put("red",666.0);
        Caract.put("white",1.0);
        Caract.put("black",1.0);
        Caract.put("yellow",1.0);
        Caract.put("metis",1.0);
        PriceMap.put("Colour",Caract);
        Caract.clear();
        Caract.put("female",69.0);
        Caract.put("male",666.0);
        Caract.put("other",1.0);
        PriceMap.put("Sex",Caract);
        Caract.clear();
        Caract.put("extra_small",1.0);
        Caract.put("small",3.0);
        Caract.put("medium",2.0);
        Caract.put("large",1.0);
        Caract.put("extra_large",0.5);
        PriceMap.put("Size",Caract);
        Caract.clear();
        Caract.put("thin",1.0);
        Caract.put("normal",2.0);
        Caract.put("thick",3.0);
        Caract.put("obese",0.5);
        PriceMap.put("Build",Caract);
        Caract.clear();
        Caract.put("less5",15.0);
        Caract.put("more5less8",10.0);
        Caract.put("more8less12",5.0);
        Caract.put("more12",1.0);
        PriceMap.put("Age",Caract);
        Caract.clear();
    }

     /**
     * Default constructor
     */
    public Gnome(int id,String name,String age,String skincolour,String size,String build,String sex) {
        this.Id = id;
        this.Name = name;
//        this.Age = age;
//        this.SkinColour = skincolour;
//        this.Size=size;
//        this.Build=build;
//        this.Sex=sex;
        this.Price=this.GetPrice();
    }

    public void setId(Integer id) {
        this.Id = id;
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

    public double GetPrice() {
       double Price = 0;
        Price += PriceMap.get("Colour").get(this.SkinColour);
        Price += PriceMap.get("Sex").get(this.Sex);
        Price += PriceMap.get("Build").get(this.Build);
        Price += PriceMap.get("Size").get(this.SkinColour);
        Price += PriceMap.get("Age").get(this.Age);

        return Price ;
    }

}