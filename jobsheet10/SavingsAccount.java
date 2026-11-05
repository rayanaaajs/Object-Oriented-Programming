package jobsheet10;

public class SavingsAccount extends Account implements InterestBearing  {
    private static final double MINIMUM_BALANCE = 50000;
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    //jobsheet 9
    public double monthlyFee(){
        return 0;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //jobsheet 9
    @Override
    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override 
    protected boolean canWithdraw(double amount){
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("Account Type: Savings, Interest rate: " + interestRate);
    }
}
