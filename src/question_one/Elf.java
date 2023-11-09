package question_one;

import java.util.ArrayList;

/**
 * A class representing each elf and how much food they are carrying
 * @author rylieplatt
 */
public class Elf {
    /** food carried by the elf */
    private final ArrayList<Integer> bag;

    /**
     * A constructor which makes an elf and fills its bag with
     * the given list of food
     *
     * @param food an arraylist of calories representing food items
     */
    protected Elf(ArrayList<Integer> food){
        this.bag = food;
    }

    /**
     * Returns the total calories being carried by the elf
     * @return total calories being carried by the elf
     */
    public int getCalories() {
        int calories = 0;
        for(int food:bag){  //iterate through food list to add up cals
            calories += food;
        }
        return calories;
    }
}
