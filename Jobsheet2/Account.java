package Jobsheet2;

public class Account {
    public String ownerName;
    public double balance;
    public Account(){
        
    }
    public Account(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
        if (isOverdrawn()) {
            balance += amount;
            System.out.println("Withdraw rejected: insufficient balance.");
        }
    }

    public void printInfo(){
        System.out.println(ownerName + " - balance " + balance);
    }

    public String formatBalance(){
        return String.format("%,.2f", balance);
    }

    public boolean isOverdrawn(){
        return balance < 0;
    }
}


