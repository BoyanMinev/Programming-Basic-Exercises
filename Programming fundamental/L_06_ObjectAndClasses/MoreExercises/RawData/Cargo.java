package L_06_ObjectAndClasses.MoreExercises.RawData;

public class Cargo {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    private String type;



    public Cargo(int weight, String type){
        this.weight = weight;
        this.type = type;
    }
}
