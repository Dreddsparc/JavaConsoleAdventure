package net.forevercoding.consolefun;

import java.util.HashMap;
import java.util.Map;

public class MapCreator extends Room{
    public MapCreator() {
    }

    // Utility program to create maps for the game.
    public static void main(String[] args) {
        Map<String, Integer> exits = new HashMap<>();
        System.out.println("This will be a utility to create maps for the game.");


        // basic testing of room creation
        Room room1 = new Room();
        room1.setRoomDescription("This is a plain white room");
        room1.setRoomNumber(1);
        exits.put("south", 2);
        exits.put("east", 3);
        room1.setAvailExits(exits);
        System.out.println(room1.getRoomDescription());
        System.out.println(room1.getAvailExits());

    }
}
