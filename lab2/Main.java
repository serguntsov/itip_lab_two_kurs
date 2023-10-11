package lab2;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();
        
        Car car1 = new Car(6, "Russia", 4);
        Truck truck1 = new Truck("sand");
        Motorcycle motorcycle1 = new Motorcycle(3, "USA", 0);
        
        System.out.println("--- Get-metod ---\n" + car.getAge());
        System.out.println(truck.getWheel());
        System.out.println(motorcycle.getMotor() + "\n");


        car.setAge(2);
        truck.setWheel(10);
        motorcycle.setMotor("electric");

        System.out.println("--- Car ---\n" + "Brand: " + car.getBrand() + "\nAge: " + car.getAge() + "\nMotor: " + car.getMotor() + 
        "\nWheel: " + car.getWheel() + "\nCountry: " + car.getCountry() + "\nDoor: " + car.getDoor() + "\nHorsepower: " + car.horsepower() +"\n");
        System.out.println("--- Car1 ---\n" + "Brand: " + car1.getBrand() + "\nAge: " + car1.getAge() + "\nMotor: " + car1.getMotor() + 
        "\nWheel: " + car1.getWheel() + "\nCountry: " + car1.getCountry() + "\nDoor: " + car1.getDoor() + "\nHorsepower: " + car1.horsepower() +"\n");

        System.out.println("--- Truck ---\n" + "Brand: " + truck.getBrand() + "\nAge: " + truck.getAge() + "\nMotor: " + truck.getMotor() + 
        "\nWheel: " + truck.getWheel() + "\nCountry: " + truck.getCountry() + "\nDoor: " + truck.getDoor() + 
        "\nCargo: " + truck.getCargo() + "\nHorsepower: " + truck.horsepower() + "\n");
        System.out.println("--- Truck1 ---\n" + "Brand: " + truck1.getBrand() + "\nAge: " + truck1.getAge() + "\nMotor: " + truck1.getMotor() + 
        "\nWheel: " + truck1.getWheel() + "\nCountry: " + truck1.getCountry() + "\nDoor: " + truck1.getDoor() + 
        "\nCargo: " + truck1.getCargo() + "\nHorsepower: " + truck1.horsepower() + "\n");

        System.out.println("--- Motorcycle ---\n" + "Brand: " + motorcycle.getBrand() + "\nAge: " + motorcycle.getAge() + "\nMotor: " + motorcycle.getMotor() +
        "\nWheel: " + motorcycle.getWheel() + "\nCountry: " + motorcycle.getCountry() + "\nDoor: " + motorcycle.getDoor() + "\nHorsepower: " + motorcycle.horsepower() + "\n");
        System.out.println("--- Motorcycle1 ---\n" + "Brand: " + motorcycle1.getBrand() + "\nAge: " + motorcycle1.getAge() + "\nMotor: " + motorcycle1.getMotor() +
        "\nWheel: " + motorcycle1.getWheel() + "\nCountry: " + motorcycle1.getCountry() + "\nDoor: " + motorcycle1.getDoor() + "\nHorsepower: " + motorcycle1.horsepower() + "\n");

        System.out.println(Transport.getCountObject());
    }
}