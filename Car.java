package week3;

public class Car {
    
    protected String plateNumber;
    protected String model;
    protected double mileage = 0;
    protected double fuelLevel;
    protected double tankCapacity;
    
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }
    public void drive(double km) {
        
        if (km / 10.0 > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= (km / 10.0);
            System.out.println("Driving " + km + " kilometers.");
        }
    }

    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
            System.out.println("Refueling " + amount + " liters.");
        }
    }

    public void checkStatus() {
        System.out.println("Current Mileage : " + mileage);
        System.out.println("Fuel Level : " + fuelLevel);
        
       
        if (fuelLevel < tankCapacity * 0.1) {
            System.out.println("Low fuel warning!");
        }
    }
}
