package lab2;
public abstract class Transport {
    private String brand;
    private float age;
    private String motor;
    private static int countObject;

    public Transport(){
        brand = "Mercedes";
        age = 0;
        motor = "petrol";
        countObject++;
    }
    public Transport(String brand, float age, String motor){
        this.brand = brand;
        this.age = age;
        this.motor = motor;
        countObject++;
    }
    public String getBrand(){
        return this.brand;
    }
    public float getAge(){
        return this.age;
    }
    public String getMotor(){
        return this.motor;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setAge(float age){
        this.age = age;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }

    public static int getCountObject() {
        return countObject;
    }

    public abstract int horsepower();
}
