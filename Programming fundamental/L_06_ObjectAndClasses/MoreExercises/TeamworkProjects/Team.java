package L_06_ObjectAndClasses.MoreExercises.TeamworkProjects;



import java.util.List;

public class Team {
    private String creator;
    private String name;
    private List<String> teammate;

    public String getCreator() {
        return creator;
    }

    public List<String> getTeammate() {
        return teammate;
    }

    public Team(String creator, String name, List<String> teammate) {
        this.creator = creator;
        this.name = name;
        this.teammate = teammate;
    }

    public String getName() {
        return name;
    }
}
