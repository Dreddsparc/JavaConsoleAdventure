package net.forevercoding.consolefun;

public class LootItem {

    //region Instance Variables
    private String itemName;
    private String itemDescription;
    private Integer itemWeight;
    //endregion

    //region Constructors
    public LootItem(String itemName, String itemDescription, Integer itemWeight) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
    }
    //endregion

    //region Getters
    public String getItemName() {
        return itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public Integer getItemWeight() {
        return itemWeight;
    }
    //endregion

    //region Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public void setItemWeight(Integer itemWeight) {
        this.itemWeight = itemWeight;
    }
    //endregion


}
