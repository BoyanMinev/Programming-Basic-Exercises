package L_06_ObjectAndClasses.MoreExercises.CarSalesman;

public class Engine {
    private String model;
    private int power;

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    private String displacement;
    private String efficiency;


    public Engine(String model, int power, String displacement, String efficiency){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
}
