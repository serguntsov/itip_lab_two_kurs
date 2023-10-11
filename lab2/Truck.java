package lab2;
public class Truck extends Car{
    private String cargo;
    
    public Truck(){
        super();
        cargo = "stone";
    }
    public Truck(String cargo){
        this.cargo = cargo;
    }
    public Truck(String cargo, int wheel, String country, int door, String brand, float age, String motor){
        super(wheel, country, door, brand, age, motor);
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public int horsepower() {
        return 1200;
    }
}
