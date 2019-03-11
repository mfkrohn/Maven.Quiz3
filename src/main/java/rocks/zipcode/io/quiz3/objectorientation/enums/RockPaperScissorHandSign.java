package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("paper","scissor"),
    PAPER("scissor","rock"),
    SCISSOR("rock","paper");

    String winner;
    String loser;


    RockPaperScissorHandSign(String winner, String loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public RockPaperScissorHandSign getValue(String str){
        for (RockPaperScissorHandSign thissign:RockPaperScissorHandSign.values()) {
            if(str.equalsIgnoreCase(thissign.name())){
                return thissign;
            }
        }
        return null;
    }

    public RockPaperScissorHandSign getWinner() {
        return this.getValue(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return this.getValue(loser);
    }
}
