package com.VendingMachineLads;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemNameTest(){
        Item fanta = new Item("Fanta",1.10);

        assertThat(fanta.getItemName(), is("Fanta"));
    }
    @Test
    public void itemPriceTest(){
        Item fanta = new Item("Fanta",1.10);

        assertThat(fanta.getItemPrice(), is(1.10));
    }

    @Test
    public void itemPriceAndNameTest(){
        Item fanta = new Item("Fanta",1.10);

        assertThat(fanta.toString(), is("Item Name :'Fanta'Item Price1.1"));
    }

    @Test
    public void should_DispenseItem_WhenGivenFanta(){
        Item fanta = new Item("Fanta",1.10);
        assertTrue(fanta.dispence());
    }

    @Test
    public void should_ReturnFalse_WhenGivenInvalidItemWithNoName(){
        Item falseItem = new Item("Fanta",0.00);
        assertThat(falseItem.dispence(),is(false));
    }

}