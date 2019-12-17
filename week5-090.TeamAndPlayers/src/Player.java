public class Player {
    
    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this.name = name;
        this.goals = 0;
    }

    public int goals() {
        return goals;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ", goals " + this.goals; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
