import java.util.Random;
/**
 * Fighter class:
 * Defines methods and constructors relating to each fighter
 * Stores each fighter's data
 */
public class Fighter
{
    /**
     * Instance variables
     */
    private String name;
    private int healthPoints;
    private int attackDamage;
    private int healAmount;
    private Random rng;
    
    /**
     * Fighter Constructors
     */
    public Fighter(){
        name = "Jim Bob";
        healthPoints = 100;
        attackDamage = 30;
        healAmount = 15;
        rng = new Random();
    }
    public Fighter(String initName, int initHealth, int initDamage, int initHealAmount){
        name = initName;
        healthPoints = initHealth;
        attackDamage = initDamage;
        healAmount = initHealAmount;
        rng = new Random();
    }
    /**
     * Gets fighter's name
     */
    public String getName(){
        return name;
    }
    /**
     * Gets fighter's amount of health points
     */
    public int getHealthPoints(){
        return healthPoints;
    }
    /**
     * Gets fighter's damage
     */
    public int getAttackDamage(){
        return attackDamage;
    }
    /**
     * Gets fighter's amount they can heal
     */
    public int getHealAmount(){
        return healAmount;
    }
    /**
     * Sets fighter's name
     */
    public void setName(String newName){
        name = newName;
    }
    /**
     * Sets fighter's amount of health points
     */
    public void setHealthPoints(int newHealthPoints){
        healthPoints = newHealthPoints;
    }
    /**
     * Sets fighter's damage
     */
    public void setAttackDamage(int newAttackDamage){
        attackDamage = newAttackDamage;
    }
    /**
     * Displays how much damage will be dealt and returns that value
     */
    public int dealDamage(){
        int damageDelt = rng.nextInt(attackDamage)+1;
        System.out.println(name+" deals "+damageDelt+" damage");
        return damageDelt;
    }
    /**
     * Fighter takes damage
     */
    public void takeDamage(int amount){
        healthPoints-=amount;
        System.out.println(name+" was attacked and now has "+healthPoints+" health");
    }
    /**
     * Fighter heals
     */
    public void heal(){
        Random rng = new Random();
        int amountHealed = rng.nextInt(healAmount)+1;
        healthPoints+=amountHealed;
        System.out.println(name+" healed "+amountHealed+". Now has "+healthPoints);
    }
    /**
     * Displays the values of the fighter
     * Ex: Fighter has 10 health, can deal 10 damage, and can heal 10 health points
     */    
    public String toString(){
        return name+" has "+healthPoints+" health, can deal "+attackDamage+"damage, and can heal "+healAmount+" health points";
    }
}
