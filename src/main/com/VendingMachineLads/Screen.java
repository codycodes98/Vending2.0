package com.VendingMachineLads;

public class Screen {

    private final String BREAKER_LINE = "=========================\n";

    public void display(Object o){
        if ((o instanceof String)||(o instanceof Number)){
            System.out.println(o.toString());
        }else{
            String invalidObject = ("Invalid display object " + o.getClass().getName());
            System.out.println(formatForScreen(invalidObject));
        }
    }

    public String formatForScreen(String s){
        String returner = "";
        returner += BREAKER_LINE;
        returner += s + "\n";
        returner += BREAKER_LINE;
        return returner;
    }

}
