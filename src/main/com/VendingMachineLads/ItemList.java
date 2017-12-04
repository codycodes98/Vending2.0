package com.VendingMachineLads;

import com.VendingMachineLads.money.MoneyStore;

import java.util.HashMap;
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

    public boolean getItemsFromList(MoneyStore moneyStore, Button button) {
        Double moneyOfItemSpecified = button.item.getItemPrice();
        String nameOfItemSpecified = button.item.getItemName();
        if (moneyOfItemSpecified >= moneyStore.getCurrentMoneyInMachine()){
            VendingMachine.Screen.formatForScreen("Dispensed : " + nameOfItemSpecified);
            return button.item.dispence();
        }else{
            VendingMachine.Screen.formatForScreen("Not enough Money");
            return false;
        }
    }
}


