package com.VendingMachineLads;


import java.util.Collection;
import java.util.LinkedList;

public class Dispenser {

    public static Collection<Item> dispensedItems = new LinkedList<>();

    public static boolean dispenseItem(Item item){
        if (item.getItemName() != null && item.getItemPrice() != 0.00){
            dispensedItems.add(item);
            VendingMachine.MoneyStore.removeFundsFromStore(item);
            return true;
        }else{
            return false;
        }
    }

}
