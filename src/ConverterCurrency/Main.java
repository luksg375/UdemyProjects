package ConverterCurrency;

import ConverterCurrency.util.ConverterCurrency;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        ConverterCurrency.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars you will be bought?");
        ConverterCurrency.dollarBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", ConverterCurrency.Converter());


        sc.close();
    }
}