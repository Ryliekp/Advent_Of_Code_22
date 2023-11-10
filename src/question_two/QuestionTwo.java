package question_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTwo {
    ArrayList<Round> rounds;
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

    public static void main(String[] args) {
        QuestionTwo qTwo = new QuestionTwo(args[0]);
    }
}
