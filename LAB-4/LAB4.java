import java.util.ArrayList;
import java.util.Scanner;
public class LAB4 {
        private static String accountNumber;
        private static String accountHolderName;
        private static double accountBalance;
        private static ArrayList<String> transactions = new ArrayList<>();

public static void main(String[] args) {
initializeCustomer();
displayMenu();
}
private static void initializeCustomer() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter account number: ");
    accountNumber = scan.nextLine();
    System.out.println("Enter account holder name: ");
    accountHolderName = scan.nextLine();
    System.out.println("Enter account balance: ");
    accountBalance = scan.nextDouble();
    }

private static void depositMoney() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter amount to deposit: ");
    double amount = scan.nextDouble();
    accountBalance += amount;
    String transaction = String.format("Deposited $%.2f", amount);
    transactions.add(transaction);
    System.out.println("Deposit successful.");
    }

private static void WithdrawMoney() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter amount to withdraw: ");
    double amount = scan.nextDouble();
    if (accountBalance >= amount) {
    accountBalance -= amount;
    String transaction = String.format("Withdrew $%.2f", amount);
    transactions.add(transaction);
    System.out.println("Withdrawal successful.");
    } else {
    System.out.println("Insufficient funds.");
    }
    }

private static void printTransactions() {
    for (String transaction : transactions) {
        System.out.println(transaction);
        }
        }
        
private static void printAccountSummary() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Account Balance: $" + accountBalance);
    }

private static void displayMenu() {
    Scanner scan = new Scanner (System.in);
    boolean exit = false;
    while (!exit) {
    System.out.println("\nSelect an option:");
    System.out.println("1. Deposit Money");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Print Transactions");
    System.out.println("4. Print Account Summary");
    System.out.println("5. Exit");
    int choice = scan.nextInt();
    switch(choice){
    case 1:
    depositMoney();
    break;
    case 2:
    WithdrawMoney();
    break;
    case 3:
    printTransactions();
    break;
    case 4:
    printAccountSummary();
    break;
    case 5:
    exit = true;






}



}
}
}

    


    