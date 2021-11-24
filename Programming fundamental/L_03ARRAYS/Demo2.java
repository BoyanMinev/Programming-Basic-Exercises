package L_03ARRAYS;

public class Demo2 {
    public static void main(String[] args) {


        String values = "1, 2, 21, 15";
        String[] items = values.split(", ");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {

            arr[i] = Integer.parseInt(items[i]);
        }

    }
}
