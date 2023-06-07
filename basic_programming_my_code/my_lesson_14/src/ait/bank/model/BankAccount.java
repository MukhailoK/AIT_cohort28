package ait.bank.model;

public class BankAccount {
    private final long account;
    private final String bank;
    private String owner;
    private int branch;
    private double balance;

    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    public BankAccount(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = 0.;
    }

    public BankAccount(long account, String bank, int branch) {
        this.account = account;
        this.owner = "Anonymous";
        this.bank = bank;
        this.branch = branch;
        this.balance = 0.;
    }

    public long getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account=" + account +
                ", owner='Mr." + owner + '\'' +
                ", bank='" + bank + '\'' +
                ", branch=" + branch +
                ", balance=$" + balance +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = this.balance + balance;
    }

    public boolean sendMoney(BankAccount whomSend, double sum) {
        if (balance >= sum) {
            withDraw(sum);
            return whomSend.deposit(sum);
        }
        return false;
    }

    public boolean deposit(double sum) {
        double oldBal = balance;
        balance = balance + sum;
        return oldBal < balance;
    }

    public boolean withDraw(double sum) {
        if (balance >= sum) {
            balance = balance - sum;
            return true;
        }
        return false;
    }

    public void printResultTransaction(boolean transaction) {
        System.out.println("Transaction:\n"
                + (transaction ? "successful" : "error") + "\n"
                + "Your balance:\n"
                + balance + "\n");
    }
}