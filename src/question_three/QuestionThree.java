package question_three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Finds an item shared between rucksacks and adds their priorities
 *
 * @author Rylie Platt
 */
public class QuestionThree {

    /** a list of all the elf's rucksacks*/
    private ArrayList<Rucksack> rucksacks;

    /**
     * A constructor which builds the list of rucksacks
     * @param filename the name of the input file
     */
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

    /**
     * Finds an item shared between three rucksacks
     * @param one rucksack one
     * @param two rucksack two
     * @param three rucksack three
     * @return the item shared between all three rucksacks
     */
    protected char sort(Rucksack one, Rucksack two, Rucksack three){
        String oneContent = one.getContent();
        String twoContent = two.getContent();
        String threeContent = three.getContent();
        for(int i = 0 ; i < oneContent.length(); i++){
            char curr = oneContent.charAt(i);
            if(twoContent.contains(String.valueOf(curr))
                    && threeContent.contains(String.valueOf(curr))){
                return curr;
            }
        }
        return ' ';
    }

    /**
     * finds the sum of the priorities of all the shared items
     * @return the sum of the priorities of all the shared items
     */
    private int getSum(){
        int sum = 0;
        for(int i = 0; i < this.rucksacks.size(); i++){
            char share = sort(this.rucksacks.get(i),
                    this.rucksacks.get(i+=1), this.rucksacks.get(i+=1));
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
