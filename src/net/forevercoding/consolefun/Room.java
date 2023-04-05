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
    public Room(){

    }

    public Room(Integer roomNumber, String roomDescription, Map<String, Integer> availExits, Map<LootItem, Integer> roomLoot) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.availExits = availExits;
        this.roomLoot = roomLoot;
    }

}
