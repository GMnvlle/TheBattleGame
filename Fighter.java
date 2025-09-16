import java.util.Random;

public class Fighter
{
    /**
     * Instance variables
     */
    private String name;
    private int healthPoints;
    private int attackDamage;
    private Random rng = new Random();
    
    /**
     * Constructors
     */
    public Fighter(){
        name = "Jim Bob";
        healthPoints = 100;
        attackDamage = 30;
    }
    public Fighter(String initName, int initHealth, int initDamage){
        name = initName;
        healthPoints = initHealth;
        attackDamage = initDamage;
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
}
