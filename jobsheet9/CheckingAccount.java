package jobsheet9;

public class CheckingAccount extends Account implements Auditable {
    private static final double MONTHLY_FEE = 15000;
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override 
    public double monthlyFee(){
        return MONTHLY_FEE;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override 
    protected boolean canWithdraw(double amount){
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("Account Type: Checking, overdraft limit: " + overdraftLimit);
    }
    

    //tugas jobsheet 9
    @Override 
    public String auditLog(){
        //  teks yang dicetak memuat nomor rekening dan saldonya.
        return "Account Number: " + getAccountNumber() + ", Balance: " + getBalance();
    }
}
