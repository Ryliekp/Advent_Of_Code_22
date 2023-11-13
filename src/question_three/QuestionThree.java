package question_three;

import question_two.Round;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThree {

    public QuestionThree(String filename){
        try (Scanner in = new Scanner(new File(filename))) {
            String round;
            this.-- = new ArrayList<>();
            while (in.hasNextLine()) {
                round = in.nextLine();
                String[] plays = round.split(" ");
                this.--.add(new Round(plays));
            }
        } catch (
                FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }
}
