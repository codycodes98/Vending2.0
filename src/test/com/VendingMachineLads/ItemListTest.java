package com.VendingMachineLads;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemListTest {

    @Test
    public void testForItemAdd(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1);

        instance.addToItemList(buttonOne,fanta);
        instance.getItemFromList(1);

        assertThat(instance.getItemFromList(1), is(fanta));
    }
    @Test
    public void testForMultipleItemsThenRetrieveSpecificItem(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1);
        Item coke = new Item("Coke",1.20);
        Button buttonTwo = new Button(2);
        Item sparklingWater = new Item("Sparking Water",0.70);
        Button buttonThree = new Button(3);

        instance.addToItemList(buttonOne,fanta);
        instance.addToItemList(buttonTwo,coke);
        instance.addToItemList(buttonThree,sparklingWater);

        assertThat(instance.getItemFromList(2), is(coke));
    }

    @Test
    public void testButtonNumberAssign(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1);
        Item coke = new Item("Coke",1.20);
        Button buttonTwo = new Button(2);

        instance.addToItemList(buttonOne,fanta);
        instance.addToItemList(buttonTwo,coke);

        assertThat(instance.getItemFromList(2),is(coke));
    }
}