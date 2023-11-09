package question_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program organizes elves by the amount of calories they are carrying
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
     * Sorts the elves by their total calories from largest to smallest
     * @param e array list of elves
     */
    private void BubbleSort(ArrayList<Elf> e){
        int size = e.size();
        Elf temp;
        for(int i = 0; i < size; i++){
            for(int j = 1; j < (size-i); j++){
                if(e.get(j-1).getCalories() < e.get(j).getCalories()){
                    //^^switch  < to > if you want smallest to largest
                    temp = e.get(j-1);
                    e.set(j-1, e.get(j));
                    e.set(j, temp);
                }
            }
        }
    }

    /**
     * Creates the list of elves and sorts them by calorie count.
     * @param args command line arguments (the filename)
     */
    public static void main(String[] args){
        QuestionOne qOne = new QuestionOne(args[0]);
        qOne.BubbleSort(qOne.elves);
        System.out.println("Part one: " + qOne.elves.get(0).getCalories());
        int total = 0;
        for(int i = 0; i < 3; i++){
            total += qOne.elves.get(i).getCalories();
        }
        System.out.println("Part two: " + total);
    }
}
