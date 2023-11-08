package question_one;

import java.util.ArrayList;

public class Elf {
    private final ArrayList<Integer> bag;

    protected Elf(ArrayList<Integer> food){
        this.bag = food;
    }

    public int getCalories() {
        int calories = 0;
        for(int food:bag){
            calories += food;
        }
        return calories;
    }
}
