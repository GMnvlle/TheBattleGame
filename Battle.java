import java.util.Scanner;
/**
 * Battle class:
 * Methods and constructors relating to the battle
 * Stores the battle's data
 */
public class Battle
{
    /**
     * Instance variables
     */
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    private Scanner scan;
    private boolean battleOver;
    /**
     * Battle Constructor
     */
    public Battle(Fighter newAttacker, Fighter newDefender)
    {
        attacker = newAttacker;
        defender = newDefender;
        numRounds = 0;
        scan = new Scanner(System.in);
        battleOver=false;
    }
    /**
     * Gets attacker object
     */
    public Fighter getAttacker(){
        return attacker;
    }
    /**
     * Gets defender object
     */
    public Fighter getDefender(){
        return defender;
    }
    /**
     * Gets round number
     */
    public int getNumRounds(){
        return numRounds;
    }
    /**
     * Gets whether or not the battle is over
     */
    public boolean getBattleOver(){
        return battleOver;
    }
    /**
     * Takes turn
     * If the user types attack, it will either
     * Deal damage to the defender
     * Or end the battle
     * If they type heal, the attacker will heal
     * If neither of these are typed then the user loses their turn
     */
    public void takeTurn(){
        System.out.println(attacker.getName()+", do you want to attack or heal");
        String userInput = scan.nextLine();
        if(userInput.equals("attack")){
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);
            if(defender.getHealthPoints()<=0){
                battleOver=true;
            }
        }
        else if(userInput.equals("heal")){
            attacker.heal();
        }
        else{
            System.out.println("Invalid option, "+attacker.getName()+" lost their turn");
        }
        numRounds++;
    }
    /**
     * Swaps attacker to defender and defender to attacker
     * It is now the defender's turn to attack
     */
    public void swapFighters(){
        Fighter newDefender = attacker;
        attacker = defender;
        defender = newDefender;
    }
    /**
     * Prints round and attacker and defender's health points
     */
    public void printRoundUpdate(){
        System.out.println("Round "+numRounds);
        System.out.println(attacker.getName()+": "+attacker.getHealthPoints());
        System.out.println(defender.getName()+": "+defender.getHealthPoints());
    }
    /**
     * Prints attacker and defender's names and toString method
     * Used at beginning of game
     */
    public void printStartInfo(){
        System.out.println("Welcome to a fight between "+attacker.getName()+" and "+defender.getName());
        System.out.println(attacker.toString());
        System.out.println(defender.toString());
    }
    /**
     * Prints that battle is over and determines who won
     */
    public void printEndInfo(){
        System.out.println("Battle over!");
        System.out.println(attacker.getName()+" has "+attacker.getHealthPoints());
        System.out.println(defender.getName()+" has "+defender.getHealthPoints());
        if(defender.getHealthPoints()>attacker.getHealthPoints()){
            System.out.println(defender.getName()+" won!");
        }
        else if(attacker.getHealthPoints()>defender.getHealthPoints()){
            System.out.println(attacker.getName()+" won!");
        }
    }
}
