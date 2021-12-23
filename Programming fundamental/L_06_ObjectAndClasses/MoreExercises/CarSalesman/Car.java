package L_06_ObjectAndClasses.MoreExercises.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("%s:%n" +
                        "  %s:%n" +
                        "    Power: %d%n" +
                        "    Displacement: %s%n" +
                        "    Efficiency: %s%n" +
                        "  Weight: %s%n" +
                        "  Color: %s", this.model, this.engine.getModel(), this.engine.getPower(),
                this.engine.getDisplacement(), this.engine.getEfficiency(), this.weight,
                this.color);
    }

}
