package com.VendingMachineLads;

import java.util.HashMap;
import java.util.Map;

public class ItemList {

    private Map<Integer,Item> itemList = new HashMap<Integer,Item>();
    private Integer lastButtonNumber = 1;

    public void addToItemList(Item item){
        itemList.put(lastButtonNumber,item);
        lastButtonNumber++;
    }

    public Item getitemFromList(Integer buttonRequest) {
        for (int i = 1; i <= itemList.size(); i++) {
            if (i == buttonRequest) {
                return itemList.get(buttonRequest);
            }
        }
        return null;
    }
}


