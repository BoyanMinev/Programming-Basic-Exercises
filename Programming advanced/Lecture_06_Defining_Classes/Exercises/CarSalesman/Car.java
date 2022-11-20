package Lecture_06_Defining_Classes.Exersices.CarSalesman;

import jdk.jshell.spi.ExecutionControl;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;


    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;

    }
    public Car(String model, Engine engine, int weight){
        this(model, engine);
        this.weight = weight;
    }
    public Car(String model, Engine engine, String color){
        this(model, engine);
        this.color = color;
    }
    public Car(String model, Engine engine, int weight, String color){
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        //optional parameters when they miss
        String carWeight;
        String carColor;
        String engineDisplacement;
        String engineEfficiency;

        if (weight == 0){
            carWeight = "n/a";
        }else {
            carWeight = "" + weight;
        }
        if (color == null){
            carColor = "n/a";
        }else {
            carColor = color;
        }
        if (engine.getDisplacement() == 0){
            engineDisplacement = "n/a";
        }else {
            engineDisplacement = "" + engine.getDisplacement();
        }
        if (engine.getEfficiency() == null){
            engineEfficiency = "n/a";
        }else {
            engineEfficiency = "" + engine.getEfficiency();
        }

        return String.format("%s:%n" +
                "%s:%n" +
                "Power: %d%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n" +
                "Weight: %s%n" +
                "Color: %s", model, engine.getModel(), engine.getPower(), engineDisplacement, engineEfficiency,
                carWeight, carColor);








    }
}
