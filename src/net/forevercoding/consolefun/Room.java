package net.forevercoding.consolefun;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room {
    // roomNumber gives each room a unique ID this ID will be referred to in the
    // roomExits HashMap to determine which rooms are connected to this room.
    private Integer roomNumber;
    // roomDescription is a String that will be displayed to the player when they
    // enter the room.
    private String roomDescription;
    // roomExits is a HashMap that will contain the room numbers of the rooms
    // that are connected to this room.
    private Map<String, Integer> roomExits = new HashMap<>();
}
