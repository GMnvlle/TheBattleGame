/**
 * Main class:
 * Plays the game
 */
public class Main
{
    public static void main(String[] args) {
        //Creating objects
        Fighter player1 = new Fighter("Joe Schmuck", 100, 30, 15);
        Fighter player2 = new Fighter();
        Battle fight = new Battle(player1,player2);
        
        fight.printStartInfo();
        while(!fight.getBattleOver()){
            fight.printRoundUpdate();
            fight.takeTurn();
            fight.swapFighters();
        }
        fight.printEndInfo();
    }
}
