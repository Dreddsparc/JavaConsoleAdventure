package net.forevercoding.consolefun;

import java.util.HashMap;
import java.util.Map;

public class Player {

    //region Instance Variables
    // playerName is a String that will be used to identify the player.
    private String playerName;
    // playerHealth is an Integer that will be used to determine how much damage
    // the player can take before they die.
    private Integer playerHealth;
    // playerPosition is an Integer that will be used to determine which room the
    // player is currently in.
    private Integer playerPosition;
    // playerScore is an Integer that will be used to determine how many points
    // the player has earned.
    private Integer playerScore;
    // playerInventory is a HashMap that will contain the items that the player
    // has collected. And how many of each item they have.
    private Map<String, Integer> playerInventory = new HashMap<>();
    //endregion

}
