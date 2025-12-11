package rvt;

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void addMoney(double amount) {

        if (amount < 0) {
            return; 
        }

        this.balance += amount;

        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
