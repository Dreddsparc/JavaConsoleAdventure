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

    //region Constructors
    // This constructor will be used when the player is first created.
    public Player(String playerName, Integer playerHealth, Integer playerPosition, Integer playerScore) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerPosition = playerPosition;
        this.playerScore = playerScore;
    }
    //endregion

    //region Getters
    public String getPlayerName() {
        return playerName;
    }

    public Integer getPlayerHealth() {
        return playerHealth;
    }

    public Integer getPlayerPosition() {
        return playerPosition;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public Map<String, Integer> getPlayerInventory() {
        return playerInventory;
    }
    //endregion

    //region Setters
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerHealth(Integer playerHealth) {
        this.playerHealth = playerHealth;
    }

    public void setPlayerPosition(Integer playerPosition) {
        this.playerPosition = playerPosition;
    }

    public void setPlayerScore(Integer playerScore) {
        this.playerScore = playerScore;
    }

    public void setPlayerInventory(Map<String, Integer> playerInventory) {
        this.playerInventory = playerInventory;
    }
    //endregion

}
