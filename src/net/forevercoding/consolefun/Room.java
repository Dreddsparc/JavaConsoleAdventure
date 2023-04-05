package net.forevercoding.consolefun;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room {

    //region Instance Variables

    // roomNumber gives each room a unique ID this ID will be referred to in the
    // roomExits HashMap to determine which rooms are connected to this room.
    private Integer roomNumber;

    // roomDescription is a String that will be displayed to the player when they
    // enter the room.
    private String roomDescription;

    // roomExits is a HashMap that will contain the room numbers of the rooms
    // that are connected to this room. HashMap will have 4 entries, one for each
    // direction. The key will be the direction and the value will be the room
    private Map<String, Integer> availExits = new HashMap<>();

    // roomLoot is a HashMap that will contain the loot items that are in this
    // room. And how many of each item there are.
    private Map<LootItem, Integer> roomLoot = new HashMap<>();
    //endregion

    //region Constructors
    // Basic Default Constructor
    public Room(){

    }
    // Just room number and description needed
    public Room(Integer roomNumber, String roomDescription) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
    }
    // room number, description, and exits needed
    public Room(Integer roomNumber, String roomDescription, Map<String, Integer> availExits) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.availExits = availExits;
    }
    // room number, description, exits, and loot needed
    public Room(Integer roomNumber, String roomDescription, Map<String, Integer> availExits, Map<LootItem, Integer> roomLoot) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.availExits = availExits;
        this.roomLoot = roomLoot;
    }
    //endregion

    //region Setters
    protected void setRoomName(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setAvailExits(Map<String, Integer> availExits) {
        this.availExits.putAll(availExits);
    }

    public void setRoomLoot(Map<LootItem, Integer> roomLoot) {
        this.roomLoot = roomLoot;
    }
    //endregion

    //region Getters
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Map<String, Integer> getAvailExits() {
        return availExits;
    }

    public Map<LootItem, Integer> getRoomLoot() {
        return roomLoot;
    }
    //endregion

}
