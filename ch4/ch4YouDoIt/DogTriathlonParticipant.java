// Alexis Bowen
// p 141
package ch4; 
public class DogTriathlonParticipant {
    private final int numEvents;
    private static int totalCumulativeScore = 0;

    private final String name;
    private final int obedienceScore;
    private final int conformationScore;
    private final int agilityScore;
    private final int total;
    private final double average;

    public DogTriathlonParticipant(
            String name,
            int numEvents,
            int score1,
            int score2,
            int score3) {

        if (numEvents <= 0) {
            throw new IllegalArgumentException("Number of events must be greater than 0.");
        }

        this.name = name;
        this.numEvents = numEvents;
        this.obedienceScore = score1;
        this.conformationScore = score2;
        this.agilityScore = score3;

        this.total = obedienceScore
                + conformationScore
                + agilityScore;

        this.average = (double) total / numEvents;
        totalCumulativeScore += total;
    }

    public void display() {
        System.out.println(name + " participated in "
                + numEvents
                + " events and has an average score of "
                + String.format("%.2f", average));

        System.out.println(name
                + " has a total score of "
                + total
                + ", bringing the total cumulative score to "
                + totalCumulativeScore);
    }
}
