// Alexis Bowen
// p 157 B

import java.util.Scanner;

public class TestTeam {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        displayTeam(team1);
        displayTeam(team2);
        displayTeam(team3);
    }

    public static Team setTeamData() {
        System.out.print("Enter the high school name: ");
        String highSchoolName = input.nextLine();

        System.out.print("Enter the sport: ");
        String sport = input.nextLine();

        System.out.print("Enter the team name: ");
        String teamName = input.nextLine();

        Team temporaryTeam = new Team(highSchoolName, sport, teamName);
        return temporaryTeam;
    }

    public static void displayTeam(Team team) {
        System.out.println("\nHigh school: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}
