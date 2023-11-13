package question_three;

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

    private int getSum(){
        int sum = 0;
        for(Rucksack r : this.rucksacks){
            char share = r.sort();
            if(Character.isLowerCase(share)) {
                sum += (share - 96);
            }else{
                sum += (share - 38);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        QuestionThree qThree = new QuestionThree(args[0]);
        System.out.println("Sum of Priorities: " + qThree.getSum());
    }
}
