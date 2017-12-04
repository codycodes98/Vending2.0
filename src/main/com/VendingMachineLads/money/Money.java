package com.VendingMachineLads.money;

public interface Money {

     enum VALUES {
        TEN_POUND, //Ballers..
        FIVE_POUND,
        TWO_POUND,
        ONE_POUND,
        FIFTY_PENCE,
        TWENTY_PENCE,
        TEN_PENCE,
        FIVE_PENCE,
        TWO_PENCE,
        ONE_PENCE,
        ZERO;
    }

    static double getValue(VALUES values){
        switch (values){
            case ZERO: return 0.00;
            case ONE_PENCE: return 0.01;
            case TWO_PENCE: return 0.02;
            case FIVE_PENCE: return 0.05;
            case TEN_PENCE: return 0.10;
            case TWENTY_PENCE: return 0.20;
            case FIFTY_PENCE: return 0.50;
            case ONE_POUND: return 1.00;
            case TWO_POUND: return 2.00;
            case FIVE_POUND: return 5.00;
            case TEN_POUND: return 10.00;
            default: return 0.00;
        }
    }
}
