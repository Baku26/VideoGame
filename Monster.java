public class Monster {
    
    private int health = 50;
    private int attack = 10; 
    private int speed = 40;
    private String name;
    
    public Monster(String name, int health, int speed, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int newHealth) {
        health = newHealth;
        
        
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
       
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int newAttack) {
        attack = newAttack;
        
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "takes the" + damage + "damage! Health" + health);
        
    }
    public boolean isAlive() {
        return health > 0;
    }
    public Monster(String name) {
        if("Goblin".equals(name)) {
            this.health = 30;
            this.attack = 8;
            
        }
        else if ("Dragon".equals(name)) {
            this.health = 80;
            this.attack = 20;
        }
        else if ("Boss".equals(name)) {
            this.health = 200;
            this.attack = 60;
        }
    }
}