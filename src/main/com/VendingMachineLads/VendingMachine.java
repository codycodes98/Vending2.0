package com.VendingMachineLads;

import com.VendingMachineLads.money.MoneyStore;

//Customer, Vending Machine, Sale, Item, ItemList
public class VendingMachine {


    public static Dispenser Dispenser;
    public static Screen Screen;
    public static MoneyStore MoneyStore;
    public static ItemList ItemList;

    public static void main (String[] args){
        onStartUp();
    }

    public static void onStartUp(){
        Dispenser = new Dispenser();
        Screen = new Screen();
        MoneyStore = new MoneyStore(0);
        ItemList = new ItemList();
        ItemList.addToItemList(new Button(1),new Item("Fanta", 1.20));
        ItemList.addToItemList(new Button(2),new Item("Dr Pepper", 1.20));
        ItemList.addToItemList(new Button(3),new Item("Oasis Red", 1.00));
        ItemList.addToItemList(new Button(4),new Item("Lucozade", 1.20));
        ItemList.addToItemList(new Button(5),new Item("Bread", 0.10));
        ItemList.addToItemList(new Button(6),new Item("Yacht", 99.99));
    }

    private void buttonPress(Button button){
        ItemList.getItemsFromList(MoneyStore,button);
    }

    public Dispenser getDispenser() {
        return Dispenser;
    }

    public static Screen getScreen() {
        return Screen;
    }

    public static MoneyStore getMoneyStore() {
        return MoneyStore;
    }

    public ItemList getItemList() {
        return ItemList;
    }

}
