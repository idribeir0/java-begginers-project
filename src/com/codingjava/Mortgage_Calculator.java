package com.codingjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Your principal ");
    Double principal = scanner.nextDouble();
    System.out.println("Your annual interest rate: ");
    Double interest_rate = scanner.nextDouble();
    System.out.println("Period (years): ");
    Integer period = scanner.nextInt();

    Double monthlyInterestRate = (interest_rate/100) / 12;
    Integer monthlyPayments = period * 12;

    Double factor = 1 + monthlyInterestRate;
    for(int i = 1; i < monthlyPayments; i++) {
        factor *= (1 + monthlyInterestRate);
    }
    Double mortgagePayment = principal * (monthlyInterestRate * factor) / (factor - 1);

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String formattedMortgagePayment = currency.format(mortgagePayment);

    System.out.println("Your monthly mortgage payments is? " + formattedMortgagePayment);

    }
}
