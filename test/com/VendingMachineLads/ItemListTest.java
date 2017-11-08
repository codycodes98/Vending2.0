package com.VendingMachineLads;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemListTest {

    @Test
    public void testForItemAdd(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        instance.addToItemList(fanta);
        instance.getitemFromList(1);
        assertThat(instance.getitemFromList(1), is(fanta));
    }
    @Test
    public void testForMultipleItemsThenRetrieveSpecificItem(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        Item coke = new Item("Coke",1.20);
        Item sparklingWater = new Item("Sparking Water",0.70);
        instance.addToItemList(fanta);
        instance.addToItemList(coke);
        instance.addToItemList(sparklingWater);
        assertThat(instance.getitemFromList(2), is(coke));
    }

    @Test
    public void testButtonNumberAssign(){
        ItemList instance = new ItemList();
        Item fanta = new Item("Fanta",1.10);
        Item coke = new Item("Coke",1.20);
        instance.addToItemList(fanta);
        instance.addToItemList(coke);
        assertThat(instance.getitemFromList(2),is(coke));
    }
}