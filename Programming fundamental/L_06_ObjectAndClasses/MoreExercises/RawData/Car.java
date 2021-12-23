package L_06_ObjectAndClasses.MoreExercises.RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire getTire() {
        return tire;
    }

    private Tire tire;



    public Car(String model, Engine engine, Cargo cargo, Tire tire){
        this.model = model;

        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }
    @Override
    public String toString(){
        return String.format(this.model);
    }
}
