package com.eprogrammerz.examples.gof.patterns.strategy.bankapp.domain;

/**
 * Created by ${YogenRai} on 4/2/2016.
 *
 * Concrete implementation of strategy AccountType
 */
public class SavingAccount implements AccountType {
    @Override
    public double calculateInterest(double balance) {
        double interest;
        if (balance < 1000) {
            interest = balance * 0.01;
        } else if (balance > 1000 && balance < 5000) {
            interest = balance * 0.02;
        } else {
            interest = balance * 0.04;
        }
        return interest;
    }

    @Override
    public String toString() {
        return "Saving";
    }
}
