package question_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given a strategy sheet play rock paper scissors and rank up points
 */
public class QuestionTwo {
    /** A list of all the rounds of gameplay*/
    ArrayList<Round> rounds;

    /**
     * Constructor which creates all rounds given the strategy sheet
     * @param filename the name of the strategy sheet/input file
     */
    public QuestionTwo(String filename){
        try (Scanner in = new Scanner(new File(filename))) {
            String round;
            this.rounds = new ArrayList<>();
            while (in.hasNextLine()) {
                round = in.nextLine();
                String[] plays = round.split(" ");
                this.rounds.add(new Round(plays));
            }
        } catch (
            FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }

    /**
     * Gets the total score of the game
     * @param rounds A list of all rounds played
     * @return Total score
     */
    private int getScore(ArrayList<Round> rounds){
        int total = 0;
        for(Round r : rounds){
            total += r.play();
        }
        return total;
    }

    public static void main(String[] args) {
        QuestionTwo qTwo = new QuestionTwo(args[0]);
        System.out.println("Score with guide: " + qTwo.getScore(qTwo.rounds));
    }
}
