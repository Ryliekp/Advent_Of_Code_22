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

    private int play(){
        int win = 6;
        int draw = 3;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        switch (this.user) {
            case "X" -> {
                this.score += rock;
                switch (this.opponent) {
                    case "A":
                        this.score += draw;
                        break;
                    case "B":
                        break;
                    case "C":
                        this.score += win;
                        break;
                }
            }
            case "Y" -> {
                this.score += paper;
                switch (this.opponent) {
                    case "A":
                        this.score += win;
                        break;
                    case "B":
                        this.score += draw;
                        break;
                    case "C":
                        break;
                }
            }
            case "Z" -> {
                this.score += scissors;
                switch (this.opponent) {
                    case "A":
                        break;
                    case "B":
                        this.score += win;
                        break;
                    case "C":
                        this.score += draw;
                        break;
                }
            }
        }
        return this.score;
    }
}
