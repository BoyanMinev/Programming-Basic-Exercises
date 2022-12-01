package Lecture_06_Defining_Classes.Exersices.CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;


    public Engine(String model, int power){
        this.model = model;
        this.power = power;
    }
    public Engine(String model,int power, int displacement){
        this(model, power);
        this.displacement = displacement;
    }
    public Engine(String model, int power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }
    public Engine(String model, int power, int displacement, String efficiency){
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
