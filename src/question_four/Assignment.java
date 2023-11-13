package question_four;

import java.util.ArrayList;

/**
 * A pair of section assignments for elves
 *
 * @author Rylie Platt
 */
public class Assignment {
    /** sections assigned to the first elf */
    ArrayList<Integer> one;
    /** sections assigned to the second elf */
    ArrayList<Integer> two;

    /**
     * Constructor for Assignment
     * @param assignOne assignment for first elf
     * @param assignTwo assignment for second elf
     */
    protected Assignment(String assignOne, String assignTwo) {
        String[] rangeOne = assignOne.split("-");
        String[] rangeTwo = assignTwo.split("-");
        this.one = new ArrayList<>();
        this.two = new ArrayList<>();
        for (int i = Integer.parseInt(rangeOne[0]); i <= Integer.parseInt(rangeOne[1]); i++) {
            this.one.add(i);
        }
        for (int j = Integer.parseInt(rangeTwo[0]); j <= Integer.parseInt(rangeTwo[1]); j++) {
            this.two.add(j);
        }
    }

    /**
     * Checks for section overlap in the two assignments
     * @return true if overlap occurs false if not
     */
    protected boolean contains() {
        int endOne = this.one.size() - 1;
        int endTwo = this.two.size() - 1;
        if (this.two.contains(this.one.get(0)) || this.two.contains(this.one.get(endOne))) {
            return true;
        } else return this.one.contains(this.two.get(0)) || this.one.contains(this.two.get(endTwo));
    }
}
