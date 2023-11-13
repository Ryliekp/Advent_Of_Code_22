package question_four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Process elf assignments and check for overlap between pairs of assignments
 *
 * @author Rylie Platt
 */
public class QuestionFour {
    /** list of assignment pairs */
    ArrayList<Assignment> assignments;

    /**
     * Constructor for Question Four
     * @param filename name of input file
     */
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

    /**
     * Counts the number of overlaps in assignment pairs
     * @return number of overlaps in assignment pairs
     */
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
