package com.VendingMachineLads.money;

public class MoneyStore implements Money{

    private Double currentMoneyInMachine;

    public MoneyStore(Double currentMoneyInMachine) {
        this.currentMoneyInMachine = currentMoneyInMachine;
    }

    public Double getCurrentMoneyInMachine() {
        return currentMoneyInMachine;
    }

    public void increaseAmountInMoneyStore(Double increaseValue){
        currentMoneyInMachine += increaseValue;
    }


}
