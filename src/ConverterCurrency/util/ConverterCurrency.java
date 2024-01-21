package ConverterCurrency.util;

public class ConverterCurrency {

    public static double dollarPrice, dollarBought;

    public static double Converter() {
        return dollarPrice * dollarBought + (dollarPrice * dollarBought * 6 / 100);
    }

}
