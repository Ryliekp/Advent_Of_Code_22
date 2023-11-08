package question_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionOne {
    private final ArrayList<Elf> elves;
    public QuestionOne(String filename){
        this.elves = new ArrayList<>();
        try (Scanner in = new Scanner(new File(filename))) {
            ArrayList<Integer> food = new ArrayList<>();
            while (in.hasNextLine()) {
                String s = in.nextLine();
                if(s.equals("")){
                    Elf e = new Elf(food);
                    elves.add(e);
                    food = new ArrayList<>();
                }else{
                    food.add(Integer.parseInt(s));
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error opening input file: " + filename);
        }
    }

    public static void main(String[] args){
    }
}
