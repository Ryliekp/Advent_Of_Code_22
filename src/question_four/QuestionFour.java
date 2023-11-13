package question_four;

import question_one.Elf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionFour {
    ArrayList<Assignment> assignments;

    public QuestionFour(String filename){
        try (Scanner in = new Scanner(new File(filename))) {
            this.assignments = new ArrayList<>();
            while (in.hasNextLine()) {
                String[] assign = in.nextLine().split(",");
                this.assignments.add(new Assignment(assign[0], assign[1]));
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }

    private int overlap(){
        int overlaps = 0;
        for(Assignment a : this.assignments){
            if(a.contains()){ overlaps++; }
        }
        return overlaps;
    }

    public static void main(String[] args) {
        QuestionFour qFour = new QuestionFour(args[0]);
        System.out.println(qFour.overlap() + " complete overlaps occur");
    }
}
