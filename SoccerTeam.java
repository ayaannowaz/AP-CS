public class SoccerTeam {
    private int wins;
    private int losses;
    private int tie;
    
    public SoccerTeam () {
        wins = 0;
        losses = 0;
        tie = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore > otherScore) wins++;
        else if (myScore < otherScore) losses++;
        else {tie++; }
        

    }


    public static void main(String[] args) {

    }
}
