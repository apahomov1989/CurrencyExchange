package task.currencyExchange;

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {
        double exchangeRate = Double.valueOf(args[0]).doubleValue();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Exchange Rate = " + exchangeRate);
        System.out.println("Set the amount of currency : ");

        while (!keyboard.hasNext("quit")) {
            if (keyboard.hasNextDouble()) {
                double currencyAmount = keyboard.nextDouble();
                double exchangeAmount = currencyAmount * Double.valueOf(args[0]).doubleValue();
                System.out.printf("Exchange amount %.2f", exchangeAmount);
                System.out.println();
            } else {
                System.out.println("Please set amount");
                keyboard.next();
            }
        }

        System.out.println("Program was closed");
        keyboard.close();
    }
}