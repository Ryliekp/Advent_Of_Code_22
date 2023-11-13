package question_three;

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
    public void Rucksack(String bag){
        int center = bag.length() / 2;
        String[] compartments =
                {bag.substring(0,center), bag.substring(center)};
        this.one = compartments[0];
        this.two = compartments[1];
        this.shared = ' ';
    }
}
