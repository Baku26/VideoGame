import java.util.Scanner;
import java.util.Random;

public class DungonGame {
    
    private Player Player;
    private Room currentRoom;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    
    public DungonGame() {
       this.Player = Player;
        setupRooms();
        
    }
    private Room createRoom(String name,Monster monster, boolean hasTrap) {
        if(currentRoom == null) {
            currentRoom = currentRoom;
            
            
            
        }
        return currentRoom;
    
    }
    
       private void setupRooms() {
           
           Room r1 = new Room("the cellar", new Monster("Goblin"), false);
           Room r2 = new Room("the holes of python", new Monster("Dragon"), true);
           Room r3 = new Room("the spider's lair", new Monster("Goblin") ,false);
           Room r4 = new Room("the treasure room", new Monster("Boss"), false);
           r4.hasKeyLocation = true;
           
              
           
           r1.nextRoom = r2;
           r2.nextRoom = r3;
           r3.nextRoom = r4;
           r4.nextRoom = r1;
           currentRoom = r1;
           
        }
           
           
           public void start() {
               System.out.println("Welcome to the Dunegon Video game, your goal is to find the key");
               
               while (Player.isAlive()) {
                   System.out.println("currently in:" + currentRoom.roomName + "--");
                   if(currentRoom.hasTrap) {
                   System.out.println("uh oh, A trap has been set off!, -5 Speed");
                   Player.reduceSpeed();
                   currentRoom.hasTrap = false;
               }
               
               if(currentRoom.monster !=null && currentRoom.monster.isAlive()) {
                   if(!battle(currentRoom.monster)) {
                       System.out.println("Game Over!, You Lose!" + Player.getName() + "You Died");
                       return;
                       
                   }
               }if(currentRoom.hasKeyLocation) {
                   System.out.println("Congrats, you found the key in the treasure room");
                   
                   
               }
               if(Player.hasKey()) {
                   System.out.println("you got the key!, you are the winner of this game");
                   
               }
               if(currentRoom.nextRoom != null) {
                   System.out.println("Proccedingon on to the next room");
                   currentRoom = currentRoom.nextRoom;
                   
               }
               else {
                   System.out.println("you have made it to the end of the path");
                   return;
               }
           }
       }
       private boolean battle(Monster monster) {
           System.out.println("a wild" + monster.getName() + "appers out of no where");
           while (Player.isAlive() && monster.isAlive()) {
               System.out.println("n|" + Player.getName() + "health:" + Player.getHealth() + "|>" + monster.getName() + "health" + monster.getHealth());
               System.out.println("Enter the letter A to attack");
               String input = scanner.nextLine();
               
               if(input.equalsIgnoreCase("a")) {
                   int playerDamage = random.nextInt(Player.getAttack()) + 5;
                   monster.takeDamage(playerDamage);
                   System.out.println("You hit the " + monster.getName() + "for" + playerDamage + "damage!!!!");
                   
                   if(monster.isAlive()) {
                       int monsterDamage = random.nextInt(monster.getAttack()) + 2;
                       Player.takeDamage(monsterDamage);
                       System.out.println(monster.getName() + "attacks you" + monsterDamage + "Damage!!");
                   }
               }
               else {
                   System.out.println("Invaild input/Command. You took too Long!!!!");
               }
               
           }if(Player.isAlive()) {
               System.out.println("you destoryed the" + monster.getName() + "!");
                return true;
            }
            else {
                return false;
            }
        }
       }
    
    

