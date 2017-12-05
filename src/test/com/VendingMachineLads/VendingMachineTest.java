package com.VendingMachineLads;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void shouldReturnNullWhenStartUpIsNotCalled(){
        VendingMachine testObject = new VendingMachine();

        assertNull(testObject.Dispenser);
        assertNull(testObject.MoneyStore);
        assertNull(testObject.Screen);
    }

    @Test
    public void shouldReturnNotNullWhenStartUpIsCalled(){
        VendingMachine testObject = new VendingMachine();

        testObject.onStartUp();

        assertNotNull(testObject.Dispenser);
        assertNotNull(testObject.MoneyStore);
        assertNotNull(testObject.Screen);
    }
}