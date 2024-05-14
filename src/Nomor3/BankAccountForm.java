package Nomor3;
import java.util.Scanner;
import java.util.Random;
public class BankAccountForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        BankAccount bankaccount = new BankAccount();
        BankAccount bankAccount1 = new BankAccount();

        System.out.println("Welcome to Bank Sinseki");

            System.out.println("Make Bank Account:");
            System.out.print("Input your name: ");
            String name = scanner.nextLine();
            bankaccount.setName(name);

            System.out.print("Your deposit:$ ");
            int balance = scanner.nextInt();
            bankaccount.setBalance(balance);

            int id = random.nextInt(100) + 1;
            bankaccount.setId(id);

            System.out.println("Your account:");
            System.out.println("ID: " + id );
            System.out.println("Name: " + bankaccount.getName());
            bankaccount.Account();

            int choose = 0;
    for (int i = choose ; i != 5; i++) {
        System.out.println("MENU:");
        System.out.println("1.Credit\n" +
                "2.Debit\n" +
                "3.Transfer\n" +
                "4.Balance\n" +
                "5.Delete Account\n");
        System.out.println("choose(1,2,3,4,5):");
        choose = scanner.nextInt();
        scanner.nextLine();

        if (choose == 1) {
//            credit
            System.out.println("Amount: $");
            int amount = scanner.nextInt();
            bankaccount.setAmount(amount);
            bankaccount.Credit();

            System.out.println("Total Balance now: $ " +bankaccount.getBalance());
            System.out.println("\n");
        }

        else if (choose == 2) {
//            debit
            System.out.println("Amount: $ ");
            int amount = scanner.nextInt();
            bankaccount.setAmount(amount);
            if (amount <= balance) {
                bankaccount.Debit();
                System.out.println("Total balance now: $ " + bankaccount.getBalance());
            }
            else {
                System.out.println("Amount exceed balance");
            }
            System.out.println("\n");
        }

        else if (choose == 3) {
//            transfer


            System.out.println("\n");
        }

        else if (choose == 4) {
//            balance
            bankaccount.Account("Information: \n");
            System.out.println("\n");
        } else if (choose == 5) {
//            delete account
        }
    }
    }
}
