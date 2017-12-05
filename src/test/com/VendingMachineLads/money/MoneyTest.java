package com.VendingMachineLads.money;

import org.junit.Test;

import static com.VendingMachineLads.money.Money.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MoneyTest implements Money{

//    @Test
//    public void shouldReturn50PenceWhenEnumFiftyPenceIsGiven(){
//        assertThat(getValue(VALUES.FIFTY_PENCE),is(0.50));
//    }

    @Test
    public void shouldConvertIntegerToDouble_whenGivenValueOfOne(){

        assertThat(Money.returnValue(1),is(1.00));
        }
}