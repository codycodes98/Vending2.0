package com.VendingMachineLads;

public class Button {
    int id;
    Item item;

    public Button(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void press() {
        item.dispence();
    }
}
