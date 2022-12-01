package Lecture_06_Defining_Classes.Exersices.SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCostOneKm;
    private int travelDistance;

    public Car(String model, int fuelAmount, double fuelCostOneKm){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostOneKm = fuelCostOneKm;
        travelDistance = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostOneKm() {
        return fuelCostOneKm;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, travelDistance);
    }

    public void setFuelCostOneKm(double fuelCostOneKm) {
        this.fuelCostOneKm = fuelCostOneKm;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    public void drive(int amountKmToDrive){
            double neededFuel = fuelCostOneKm * amountKmToDrive;
            if (fuelAmount >= neededFuel){
                fuelAmount -= neededFuel;
                travelDistance += amountKmToDrive;
            }else {
                System.out.println("Insufficient fuel for the drive");
            }

    }




}
