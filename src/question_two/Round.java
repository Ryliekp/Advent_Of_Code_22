package question_two;

public class Round {
    int score;
    String user;
    String opponent;

    protected Round(String[] plays){
        this.score = 0;
        this.opponent = plays[0];
        this.user = plays[1];
    }

    protected int play(){
        int win = 6;
        int draw = 3;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        switch (this.user) {
            case "X" -> {   //loss
                switch (this.opponent) {
                    case "A" ->   //rock
                            this.score += scissors;
                    case "B" ->   //paper
                            this.score += rock;
                    case "C" ->   //scissors
                            this.score += paper;
                }
            }
            case "Y" -> {   //draw
                this.score += draw;
                switch (this.opponent) {
                    case "A" ->   //rock
                            this.score += rock;
                    case "B" ->   //paper
                            this.score += paper;
                    case "C" ->   //scissors
                            this.score += scissors;
                }
            }
            case "Z" -> {   //win
                this.score += win;
                switch (this.opponent) {
                    case "A" ->   //rock
                            this.score += paper;
                    case "B" ->   //paper
                            this.score += scissors;
                    case "C" ->   //scissors
                            this.score += rock;
                }
            }
        }
        return this.score;
    }
}
