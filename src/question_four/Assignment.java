package question_four;

import java.util.ArrayList;

public class Assignment {
    ArrayList<Integer> one;
    ArrayList<Integer> two;

    protected Assignment(String assignOne, String assignTwo){
        String[] rangeOne = assignOne.split("-");
        String[] rangeTwo = assignTwo.split("-");
        this.one = new ArrayList<>();
        this.two = new ArrayList<>();
        for(int i = Integer.parseInt(rangeOne[0]); i <= Integer.parseInt(rangeOne[1]); i++){
            this.one.add(i);
        }
        for(int j = Integer.parseInt(rangeTwo[0]); j <= Integer.parseInt(rangeTwo[1]); j++){
            this.one.add(j);
        }
    }

    protected boolean contains(){
        int endOne = this.one.size() - 1;
        int endTwo = this.two.size() - 1;
        return (this.one.get(0) >= this.two.get(0)) && (this.one.get(endOne) <= this.two.get(endTwo));
    }
}
