/**
 * A class for the player
 *
 */
public class Player{
    int wins;      // # of wins
    int winTotal;
    /**
     * Randomly choose rock, paper, or scissors
     */
    public ChoiceInterface playerChoice()
    {
        ChoiceInterface choice=new WrongChoice();
        int c = (int)(Math.random()*3);
        switch(c) {
            case 0:
                choice = new Rock();
                break;
            case 1:
                choice = new Paper();
                break;
            case 2:
                choice = new Scissor();
                break;
        }
        return choice;
    }
    public int setWins()
    {
        int winTotal = wins++;
        return winTotal;
    }
    public int getWins()
    {
        return(wins);
    }
}