package L_06_ObjectAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String typeList = scanner.nextLine();


        List<Song> filterSong = songs.stream().filter(e -> e.getTypeList().equals(typeList))
                .collect(Collectors.toList());
        for (Song song : filterSong) {
            System.out.println(song.getName());

        }
        if (typeList.equals("all")){
            for (Song song :
                    songs) {
                System.out.println(song.getName());
            }
        }
    }
}


