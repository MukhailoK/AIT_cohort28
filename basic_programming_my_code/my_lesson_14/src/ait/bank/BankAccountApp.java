package ait.bank;

import ait.bank.model.BankAccount;

public class BankAccountApp {
    public static void main(String[] args) {
        boolean transaction;

        BankAccount bankAccount = new BankAccount(
                123456789, "John Week", "Swiss Best Bank",
                777, 5000000.00);
        BankAccount bankAccount1 = new BankAccount(
                123456785, "John Cena", "Swiss Best Bank",
                778);
        BankAccount bankAccount2 = new BankAccount(
                123456784, "Swiss Best Bank",
                778);
        System.out.println("Bank accounts:\n"
                + bankAccount + "\n"
                + bankAccount1 + "\n"
                + bankAccount2 + "\n");

        System.out.println(bankAccount);
        transaction = bankAccount.sendMoney(bankAccount1, 500);
        bankAccount.printResultTransaction(transaction);

        transaction = bankAccount.withDraw(50000);
        bankAccount.printResultTransaction(transaction);
        System.out.println(bankAccount + "\n");

        System.out.println(bankAccount1);
        transaction = bankAccount1.deposit(1500);
        bankAccount1.printResultTransaction(transaction);

        transaction = bankAccount1.sendMoney(bankAccount, 2000);
        bankAccount1.printResultTransaction(transaction);
        System.out.println(bankAccount1 + "\n");

        System.out.println(bankAccount2);
        transaction = bankAccount.sendMoney(bankAccount2, 50000);
        bankAccount2.printResultTransaction(transaction);
        System.out.println(bankAccount2);
    }
}
