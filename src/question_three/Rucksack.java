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
    /** the item shared by the compartments */
    char shared;

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
        this.shared = ' ';
    }

    /**
     * Sorts the bag by type and returns the item initially
     * shared by both compartments
     * @return the item shared between compartments
     */
    protected char sort(){
        String bagOne = this.one;
        String bagTwo = this.two;
        String tempOne = "";
        String tempTwo = "";
        for(int i = 0 ; i < bagTwo.length(); i++){
            char one = bagOne.charAt(i);
            char two = bagTwo.charAt(i);
            if(one <= 26){
                tempOne = tempOne.concat(String.valueOf(one));
            }else {
                tempTwo = tempTwo.concat(String.valueOf(one));
            }

            if(two <= 26){
                tempOne = tempOne.concat(String.valueOf(two));
            }else {
                tempTwo = tempTwo.concat(String.valueOf(two));
            }

            if (one == two){
                this.shared = bagTwo.charAt(i);
            }
        }
        this.one = bagOne;
        this.two = bagTwo;
        return this.shared;
    }
}
