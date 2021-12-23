package L_06_ObjectAndClasses.MoreExercises.RawData;

public class Tire {
    public double getTire1Pressure() {
        return tire1Pressure;
    }

    public int getTire1Age() {
        return tire1Age;
    }

    public double getTire2Pressure() {
        return tire2Pressure;
    }

    public int getTire2Age() {
        return tire2Age;
    }

    public double getTire3Pressure() {
        return tire3Pressure;
    }

    public int getTire3Age() {
        return tire3Age;
    }

    public double getTire4Pressure() {
        return tire4Pressure;
    }

    public int getTire4Age() {
        return tire4Age;
    }

    private double tire1Pressure;
    private int tire1Age;
    private double tire2Pressure;
    private int tire2Age;
    private double tire3Pressure;
    private int tire3Age;
    private double tire4Pressure;
    private int tire4Age;

    public Tire(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age,
                double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age){
        this.tire1Pressure = tire1Pressure;
        this.tire1Age = tire1Age;
        this.tire2Pressure = tire2Pressure;
        this.tire2Age = tire2Age;
        this.tire3Pressure = tire3Pressure;
        this.tire3Age = tire3Age;
        this.tire4Pressure = tire4Pressure;
        this.tire4Age = tire4Age;
    }
}
