
public class Battle
{
    /**
     * Instance variables
     */
    private Fighter attacker;
    private Fighter defender;
    private int numRounds;
    /**
     * Constructor
     */
    public Battle(Fighter newAttacker, Fighter newDefender)
    {
        attacker = newAttacker;
        defender = newDefender;
        numRounds = 0;
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
        int amount = attacker.dealDamage();
        defender.takeDamage(amount);
        numRounds+=1;
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
}
