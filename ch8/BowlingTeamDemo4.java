// Alexis Bowen
// p 291

import java.util.*;

public class BowlingTeamDemo3 {
    public static void main(String[] args)
    {
        String name;
        final int numTeams = 4;
        BowlingTeam[] teams = new BowlingTeam[numTeams];
        int x;
        int y;
        final int numTeamMembers = 4;
        Scanner input = new Scanner(System.in);
        getTeamData(teams);
        for(y = 0; y < numTeams; ++y)
        {
        System.out.println("\nMembers of team " + 
            teams[y].getTeamName());
        for(x = 0; x < numTeamMembers; ++x)
            System.out.print(teams[y].getMember(x) + " ");
        System.out.println();
        }
        System.out.print("\n\nEnter a team name to see its roster >> ");
        name = input.nextLine();
        for(y = 0; y < teams.length; ++y)
            if(name.equals(teams[y].getTeamName()))
                for(x = 0; x < numTeamMembers; ++ x)
                    System.out.print(teams[y].getMember(x) + " ");
        System.out.println();
    }
    public static void getTeamData(BowlingTeam[] teams)
    {
        String name;
        final int numTeams = 4;
        int x;
        int y;
        final int numTeamMembers = 4;
        Scanner input = new Scanner(System.in);
    }
}
