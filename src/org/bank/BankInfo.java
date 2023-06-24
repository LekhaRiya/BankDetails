package org.bank;

public class BankInfo extends AxisBank {
    public void savings() {
    	System.out.println("Savings amount is Rs 50,000");
    }
    public void fixed() {
    	System.out.println("Fixed deposit amount is Rs 1,00,000");
    }
    public static void main(String[] args ) {
    	BankInfo cash = new BankInfo();
    	cash.savings();
    	cash.fixed();
    	cash.deposit();
    }
}
