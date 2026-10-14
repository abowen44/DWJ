// Alexis Bowen
// p 157 D

import java.util.Scanner;

public class TestGame {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Team team1 = getTeamDetails("first");
        Team team2 = getTeamDetails("second");

        System.out.print("Enter the game time: ");
        String gameTime = input.nextLine();

        Game game = new Game(team1, team2, gameTime);
        displayGameDetails(game);
    }

    public static Team getTeamDetails(String teamNumber) {
        System.out.println("Enter details for the " + teamNumber + " team:");

        System.out.print("High school name: ");
        String highSchoolName = input.nextLine();

        System.out.print("Sport: ");
        String sport = input.nextLine();

        System.out.print("Team name: ");
        String teamName = input.nextLine();

        return new Team(highSchoolName, sport, teamName);
    }

    public static void displayGameDetails(Game game) {
        System.out.println("\nGame details:");
        displayTeam(game.getTeam1());
        displayTeam(game.getTeam2());
        System.out.println("Game time: " + game.getGameTime());
    }

    public static void displayTeam(Team team) {
        System.out.println("High school: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}
