package net.forevercoding.consolefun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCreator extends Room{
    public MapCreator() {
    }

    // Utility program to create maps for the game.
    public static void main(String[] args) {
        Map<String, Integer> exits = new HashMap<>();
        System.out.println("This will be a utility to create maps for the game.");


        // basic testing of room creation
        List<Room> rooms = new ArrayList<>();

        Room room1 = new Room(1, "This is a plain white room",
                new HashMap<String, Integer>(){{put("east", 2);}});
        Room room2 = new Room(2, "You find yourself in a dimly lit room with crazy looking paintings on the wall.",
                new HashMap<String, Integer>(){{put("south", 1);}});

        rooms.add(room1);
        rooms.add(room2);

        for (Room room : rooms) {
            System.out.println(room.getRoomDescription());
            System.out.println(room.getAvailExits());
        }

    }
}
