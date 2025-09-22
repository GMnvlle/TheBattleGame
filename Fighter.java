import java.util.Random;

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
     * Constructors
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
     * Getters
     */
    public String getName(){
        return name;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getHealAmount(){
        return healAmount;
    }
    /**
     * Setters
     */
    public void setName(String newName){
        name = newName;
    }
    public void setHealthPoints(int newHealthPoints){
        healthPoints = newHealthPoints;
    }
    public void setName(int newAttackDamage){
        attackDamage = newAttackDamage;
    }
    /**
     * Methods
     */
    public int dealDamage(){
        int damageDelt = rng.nextInt(attackDamage)+1;
        System.out.println(name+" deals "+damageDelt+" damage");
        return damageDelt;
    }
    public void takeDamage(int amount){
        healthPoints-=amount;
        System.out.println(name+" was attacked and now has "+healthPoints+" health");
    }
    public void heal(){
        Random rng = new Random();
        int amountHealed = rng.nextInt(healAmount)+1;
        healthPoints+=amountHealed;
        System.out.println(name+" healed "+amountHealed+". Now has "+healthPoints);
    }
    public String toString(){
        return name+" has "+healthPoints+" health, can deal "+attackDamage+", and can heal "+healAmount;
    }
}
