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
        assertThat(fanta.toString(), is("Item{itemName='Fanta', itemPrice=1.1}"));
    }

}