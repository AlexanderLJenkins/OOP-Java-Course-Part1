import java.util.ArrayList;

public class Team {
    
    private String name;
    private int maxSize;
    private ArrayList<Player> players;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (size() < this.maxSize) {
            this.players.add(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        // returns the size of the team
        return players.size();
    }
    
    public int goals() {
        // returns the total number of goals in the team
        
        int teamGoals = 0;
        for (Player player : players) {
            teamGoals += player.goals();
        }
        return teamGoals;
    }
    
    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }
    
}
