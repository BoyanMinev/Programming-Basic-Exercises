package L_06_ObjectAndClasses.MoreExercises.TeamworkProjects;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] data1 = scanner.nextLine().split("-");
            String creator = data1[0];
            String teamName = data1[1];
            List<String> teammate = new ArrayList<>();

            if (teams.size() == 0) {
                Team team = new Team(creator, teamName, teammate);
                teams.add(team);

                teammate.add(creator);
                System.out.printf("Team %s has been created by %s!%n", teamName, creator);
            } else {
                for (Team tm : teams) {

                    if (!(tm.getCreator().equals(creator)) && tm.getName().equals(teamName)) {
                        System.out.printf("Team %s was already created!%n", teamName);
                        break;
                    } else if (tm.getCreator().equals(creator)) {
                        System.out.printf("%s cannot create another team!%n", creator);
                        break;
                    } else {
                        Team team = new Team(creator, teamName, teammate);
                        teams.add(team);

                        teammate.add(creator);
                        System.out.printf("Team %s has been created by %s!%n", teamName, creator);
                        break;
                    }
                }
            }

        }
        String input = scanner.nextLine();
        while (!input.equals("end of assignment")) {
            String[] data2 = input.split("->");
            String user = data2[0];
            String teamName = data2[1];


                isAprove(teams, user, teamName);



            input = scanner.nextLine();
        }
        List<String> disbandTeams = new ArrayList<>();
        isExistEmptyTeamAndDelete(teams, disbandTeams);

        teams.stream().sorted(Comparator.comparingInt(value -> value.getTeammate().size())).collect(Collectors.toList());
        Collections.reverse(teams);
      teams.stream().sorted(Comparator.comparing(Team ::getName)).collect(Collectors.toList());

        for (Team tm : teams) {

            System.out.printf("%s%n", tm.getName());

            for (int i = 0; i < tm.getTeammate().size(); i++) {
                if (i == 0){
                    System.out.println("-" + " " + tm.getTeammate().get(i));
                }else {
                    System.out.println("--" + " " + tm.getTeammate().get(i));
                }
            }
        }
        System.out.println("Teams to disband:");
        for (String team :
                disbandTeams) {
            System.out.println(team);
        }

    }

    private static void isExistEmptyTeamAndDelete(List<Team> teams, List<String> disbandTeams) {
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getTeammate().size() == 1){
                disbandTeams.add(teams.get(i).getName());
                teams.remove(i);
            }
        }


    }

    private static void isAprove(List<Team> teams, String user, String teamName) {
        boolean isExist = false;
        boolean isExistUser = false;
        for (Team tm :
                teams) {
            if (tm.getName().equals(teamName)){
                isExist = true;
                if(!(tm.getTeammate().contains(user))){
                    tm.getTeammate().add(user);
                }else {
                    isExistUser = true;
                }
            }
        }
        if (!isExist) {
            System.out.printf("Team %s does not exist!%n", teamName);
        }else if (isExistUser){
            System.out.printf("Member %s cannot join team %s!%n", user, teamName);
        }

    }


    private static boolean isExistUser(List<Team> teams, String user) {
        boolean isExist = false;

        for (Team tm :
                teams) {
         if (tm.getTeammate().contains(user)){
             isExist = true;
         }
        }
        return isExist;
    }
}


