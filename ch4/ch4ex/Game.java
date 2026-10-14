// Alexis Bowen 
// p 157 C
public class Game {
    private Team team1;
    private Team team2;
    private String gameTime;

    public Game(Team team1, Team team2, String gameTime) {
        this.team1 = team1;
        this.team2 = team2;
        this.gameTime = gameTime;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getGameTime() {
        return gameTime;
    }

    public static void main(String[] args) {
        Team team1 = new Team("Roosevelt High", "Basketball", "Dolphins");
        Team team2 = new Team("Lincoln High", "Basketball", "Tigers");
        Game game = new Game(team1, team2, "7 PM");

        System.out.println(game.getTeam1().getTeamName() + " vs. "
                + game.getTeam2().getTeamName());
        System.out.println("Game time: " + game.getGameTime());
    }
}
