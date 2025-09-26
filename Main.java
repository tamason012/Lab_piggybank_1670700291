package com.learning;

public class Main {
    public static void main(String[] args) {
        PiggyBank porjaiPiggy = new PiggyBank("น้องพอใจ");
        porjaiPiggy.showMoney();
        porjaiPiggy.addMoney(20);
        porjaiPiggy.addMoney(50);
        porjaiPiggy.showMoney();
    }
}
