package question_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds which elf is carrying the most calories given an input
 * file containing a list of calories
 *
 * @author Rylie Platt
 */
public class QuestionOne {
    /** List of elves */
    private final ArrayList<Elf> elves;

    /**
     * A constructor which makes the list of elves and fills their bags
     * @param filename string: name of the input file
     */
    public QuestionOne(String filename){
        this.elves = new ArrayList<>();
        try (Scanner in = new Scanner(new File(filename))) {
            ArrayList<Integer> food = new ArrayList<>();
            while (in.hasNextLine()) {
                String s = in.nextLine();
                if(s.equals("")){   //everytime there is an empty line make a new elf with collected cals
                    Elf e = new Elf(food);
                    elves.add(e);
                    food = new ArrayList<>();   //empty food list
                }else{  //if line is not empty add cal count to the list
                    food.add(Integer.parseInt(s));
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }

    /**
     * Returns the total calories carried by elf with the most calories
     * @param elf Arraylist containing all elves
     * @return total calories carried by elf with the most calories
     */
    private int getBiggest(ArrayList<Elf> elf){
        int mostCals = 0;
        for(Elf e:elf){ //iterate through elves to find the one with the most total cals
            if (mostCals <= e.getCalories()){
                mostCals = e.getCalories();
            }
        }
        return mostCals;
    }

    /**
     * Creates the list of elves and prints the value of the largest amount
     * of calories carried by the elf with the most calories.
     * @param args command line arguments (the filename)
     */
    public static void main(String[] args){
        QuestionOne qOne = new QuestionOne(args[0]);
        System.out.println(qOne.getBiggest(qOne.elves));
    }
}
