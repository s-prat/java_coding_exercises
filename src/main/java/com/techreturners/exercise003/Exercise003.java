package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        Icecream[] iceCreamArr = Icecream.values();
        for(Icecream iceCream : iceCreamArr) {
            if(iceCream.getIceCreamFlavour().equalsIgnoreCase(iceCreamFlavour)) {
                return iceCream.getIceCreamValue();
            }
        }
        return 0;
    }

    String[] iceCreamFlavours() {
        Icecream[] iceCreamArr = Icecream.values();
        return Arrays.stream(iceCreamArr).map(icecream -> icecream.getIceCreamFlavour()).toArray(String[]::new);
    }

}

enum Icecream {
    PISTACHIO("Pistachio", 0),
    RASPBERRY_RIPPLE("Raspberry Ripple", 1),
    VANILLA("Vanilla", 2),
    MINT_CHOCOLATE_CHIP("Mint Chocolate Chip", 3),
    CHOCOLATE("Chocolate", 4),
    MANGO_SORBET("Mango Sorbet", 5);

    private String iceCreamFlavour;
    private int iceCreamValue;

    private Icecream(String iceCreamFlavour, int iceCreamValue) {
        this.iceCreamFlavour = iceCreamFlavour;
        this.iceCreamValue = iceCreamValue;
    }

    public String getIceCreamFlavour() {
        return iceCreamFlavour;
    }

    public int getIceCreamValue() {
        return iceCreamValue;
    }
}
