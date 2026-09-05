package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        // Account original = new Account("Nadia", 500000);
        // Account copy = original;
        // copy.deposit(100000);

        // System.out.println("Via Original: " + original.balance);
        // System.out.println("Via copy: " + copy.balance);
        
        Account acc = new Account();
        acc.ownerName = "Nadia";
        acc.balance = 500000;
        System.out.println(acc.ownerName + " - balance: " + acc.balance);
    }
}