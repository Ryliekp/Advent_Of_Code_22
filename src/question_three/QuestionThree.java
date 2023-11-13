package question_three;

import question_two.Round;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThree {

    private ArrayList<Rucksack> rucksacks;

    public QuestionThree(String filename){
        try (Scanner in = new Scanner(new File(filename))) {
            String content;
            this.rucksacks = new ArrayList<>();
            while (in.hasNextLine()) {
                content = in.nextLine();
                this.rucksacks.add(new Rucksack(content));
            }
        } catch (
                FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }
}
