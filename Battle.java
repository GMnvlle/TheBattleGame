
public class Battle
{
    /**
     * Instance variables
     */
    private Fighter attacker;
    private Fighter defender;
    /**
     * Constructor
     */
    public Battle(Fighter newAttacker, Fighter newDefender)
    {
        attacker = newAttacker;
        defender = newDefender;
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
    /**
     * Methods
     */
    public void takeTurn(){
        attacker.dealDamage();
        int amount = attacker.getAttackDamage();
        defender.takeDamage(amount);
    }
}
