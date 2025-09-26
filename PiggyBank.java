package com.learning;

public class PiggyBank {
    String ownerName;
    double money;

    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;
    }

    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("หยอดเงินใส่กระปุกของ " + this.ownerName + " จำนวน " + amount + " บาท");
    }

    public void showMoney() {
        System.out.println("กระปุกของ " + this.ownerName + " มีเงินทั้งหมด " + this.money + " บาท");
    }
}
