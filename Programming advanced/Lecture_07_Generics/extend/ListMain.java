package Lecture_07_Generics.Lab.extend;

import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Integer> integers = List.of(13, 43, 12, 19);
        List<String> strings = List.of("13", "43", "12", "19");

        System.out.println(ListUtility.getMin(integers));
        System.out.println(ListUtility.getMax(strings));


    }
}
