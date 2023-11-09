package question_two;

public enum Play {
    ROCK("A","X",1),
    PAPER("B", "Y", 2),
    SCISSORS("C", "Z", 3);

    private final String opponent;
    private final String user;
    private final int points;

    Play(String opponent, String user, int points) {
        this.opponent = opponent;
        this.user = user;
        this.points = points;
    }
    private String opponent(){return opponent;};
    private String user(){return user;};
    private int points(){return points;};
}
