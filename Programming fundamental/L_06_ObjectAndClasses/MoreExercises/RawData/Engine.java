package L_06_ObjectAndClasses.MoreExercises.RawData;

public class Engine {

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    private int speed;
        private int power;

        public Engine(int speed, int power){
            this.speed = speed;
            this.power = power;
        }

}
