import java.util.Scanner;

public class OnlineQuizPlatform {
    static double balance = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Welcome to the Bank of ABC");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance is Rupee " + balance);
    }

    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: Rupee ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Rupee " + amount + " has been deposited to your account.");
        checkBalance();
    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: Rupee ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Rupee " + amount + " has been withdrawn from your account.");
        }
        checkBalance();
    }

    public static void exit() {
        System.out.println("Thank you for banking with us. Have a great day!");
    }
}
