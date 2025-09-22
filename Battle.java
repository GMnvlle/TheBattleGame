import java.util.Scanner;
public class Battle
{
    /**
     * Instance variables
     */
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    private Scanner scan;
    /**
     * Constructor
     */
    public Battle(Fighter newAttacker, Fighter newDefender)
    {
        attacker = newAttacker;
        defender = newDefender;
        numRounds = 0;
        scan = new Scanner(System.in);
    }
    /**
     * Getters
     */
    public Fighter getAttacker(){
        return attacker;
    }
    public Fighter getDefender(){
        return defender;
    }
    public int getNumRounds(){
        return numRounds;
    }
    /**
     * Methods
     */
    public void takeTurn(){
        System.out.println(attacker.getName()+", do you want to attack or heal");
        String userInput = scan.nextLine();
        if(userInput.equals("attack")){
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);
        }
        else if(userInput.equals("heal")){
            attacker.heal();
        }
        else{
            System.out.println("Invalid option, "+attacker.getName()+" lost their turn");
        }
        numRounds++;
    }
    public void swapFighters(){
        Fighter newDefender = attacker;
        attacker = defender;
        defender = newDefender;
    }
    public void printRoundUpdate(){
        System.out.println("Round "+numRounds);
        System.out.println(attacker.getName()+": "+attacker.getHealthPoints());
        System.out.println(defender.getName()+": "+defender.getHealthPoints());
    }
    public void printStartInfo(){
        System.out.println("Welcome to a fight between "+attacker.getName()+" and "+defender.getName());
        System.out.println(attacker.toString());
        System.out.println(defender.toString());
    }
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
