package jobsheet7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Budi", "0812-0000-0005");
        BusinessAccount business = new BusinessAccount("A005", customer, 2000000, 50000);

        System.out.println("=== STATUS AWAL ===");
        business.printInfo();

        System.out.println("\n=== UJI PENARIKAN ===");
        boolean result = business.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + result);

        System.out.println("\n=== STATUS AKHIR ===");
        business.printInfo();
    }
}
    
