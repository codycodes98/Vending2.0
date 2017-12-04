package com.VendingMachineLads.money;

import org.junit.Test;

import static com.VendingMachineLads.money.Money.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MoneyTest implements Money{

    @Test
    public void should_Return50Pence_WhenEnumFifty_PenceIsGiven(){
        assertThat(getValue(VALUES.FIFTY_PENCE),is(0.50));
    }

    @Test
    public void should_Return1Pound_WhenEnumOne_PoundIsGiven(){
        assertThat(getValue(VALUES.ONE_POUND),is(1.00));
        }
}