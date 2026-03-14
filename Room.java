
public class Room {
    

Monster monster;
String roomName;
boolean hasTrap;
Room nextRoom;
boolean cleard = false;
boolean hasKeyLocation = false;

public Room(String roomName, Monster monster, boolean hasTrap) {
    this.roomName = roomName;
    this.monster = monster;
    this.hasTrap = hasTrap;

    
}

}

