package com.VendingMachineLads;

import com.VendingMachineLads.money.MoneyStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemList {

    private Map<Button,Item> itemList = new HashMap<Button,Item>();
    private Integer lastButtonNumber = 1;

    public void addToItemList(Button button, Item item){
        itemList.put(button,item);
        lastButtonNumber++;
    }

    public Item getItemFromList(Integer buttonRequest) {
        for (int i = 1; i <= itemList.size(); i++) {
            if (i == buttonRequest) {
                return itemList.get(buttonRequest);
            }
        }
        return null;
    }

    public List<Item> getItemsFromList(MoneyStore moneyStore) {
        //get items and return any that cost less than moneyStore total
        return null;
    }
}


