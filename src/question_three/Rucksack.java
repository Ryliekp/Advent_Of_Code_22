package question_three;

/**
 * A rucksack with two compartments of items
 *
 * @author Rylie Platt
 */

public class Rucksack {
    /** compartment one */
    String one;
    /** compartment two */
    String two;

    /**
     * Constructor which creates each rucksack
     *
     * @param bag the strings of all items mixed in the bag.
     */
    protected Rucksack(String bag){
        int center = bag.length() / 2;
        String[] compartments =
                {bag.substring(0,center), bag.substring(center)};
        this.one = compartments[0];
        this.two = compartments[1];
    }

    /**
     * gets the contents of the rucksack
     * @return the item shared between compartments
     */
    protected String getContent(){
        return this.one.concat(this.two);
    }
}
