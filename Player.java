
public class Player  {
    
    private int health = 100;
    private int  attack = 40; 
    private int speed = 20;
    private String name;
    private int potions = 0;
    private boolean hasKey = false;
    
    public Player(String name, int attack , int health, int speed) {
        this.name = name;
        this.attack = attack;
        this.speed = speed;
        this.health = health;
    }
    

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "takes the" + damage + "damage! Health" + health);
        
        
    }
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth; 
      
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int newAttack) {
        attack = newAttack;
        
    }
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    
    }
    public void heal() {
        if (potions > 0) {
            health += 30;
            potions --;
            System.out.println(name + "endure a potion, health:" + health);
        }
        else {
            System.out.println("no potion remaining");
            
        }
       
            
        }
        public void addPotions() {
            potions++;
        }
        public void upgradeWeapons() {
            attack += 10;
            
        }
        public void reduceSpeed() {
            speed -= 5;
        }
        public void setHasKey(boolean hasKey) {
            this.hasKey = hasKey;
        }
        public boolean hasKey() {
            return hasKey;
        }
    }
    





