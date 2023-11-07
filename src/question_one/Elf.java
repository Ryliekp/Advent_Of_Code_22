package question_one;

public class Elf {
    private Integer [] bag;

    protected Elf(Integer[] food){
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
