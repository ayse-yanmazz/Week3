package week3;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("38 AB 123", "TOYOTA", 40.0, 100.0);

        System.out.println("Model: " + car1.model);
        System.out.println("Plate: " + car1.plateNumber);

        car1.drive(10);
        car1.refuel(10);
        car1.checkStatus();
    }
    
}
