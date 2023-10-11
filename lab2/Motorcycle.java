package lab2;
public class Motorcycle extends Transport{
    private int wheel;
    private String country;
    private int door;

    public Motorcycle(){
        super();
        wheel = 2;
        country = "Germany";
        door = 0;
    }
    public Motorcycle(int wheel, String country, int door){
        this.wheel = wheel;
        this.country = country;
        this.door = door;
    }
    public Motorcycle(int wheel, String country, int door, String brand, float age, String motor){
        super(brand, age, motor);
        this.wheel = wheel;
        this.country = country;
        this.door = door;
    }

    public int getWheel(){
        return this.wheel;
    }
    public String getCountry(){
        return this.country;
    }
    public int getDoor(){
        return this.door;
    }

    public void setWheel(int wheel){
        this.wheel = wheel;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setDoor(int door){
        this.door = door;
    }

    @Override
    public int horsepower() {
        return 800;
    }
    
}
