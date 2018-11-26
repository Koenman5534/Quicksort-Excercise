package nl.hva.ict.ss;

import java.util.Arrays;

/**
 * Player keeps track of the name and the highscore for a player.
 * Once created the name can't be changed. The best score for this player
 * can be changed during the lifetime of an instance.
 */
public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private long highScore;

    public Player(String firstName, String lastName, long highScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.highScore = highScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getHighScore() {
        return highScore;
    }

    public void setHighScore(long highScore) {
        this.highScore = highScore;
    }

    @Override
    public int compareTo(Player other) {
        // Should sort accending on highscore
        // In case the highscores are equal the last and first name should be taken into account.
        // First sort by lastname and only take the first name into consideration if the
        // lastnames are identical.

        if (highScore > other.highScore){
            return 1;
        } else if (highScore == other.highScore){
            // convert input string to char array
            String tempArray[] = new String[1];
            tempArray[0] = lastName;
            tempArray[1] = other.lastName;

            // sort tempArray
            Arrays.sort(tempArray);

            if (tempArray[0].equals(lastName)){
                return 1;
//            } else if () {
//                return 0;
//            }
        }
    }
        return -1;
    }
}
