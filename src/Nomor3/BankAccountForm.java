package Nomor3;

import java.util.Scanner;
import java.util.Random;

public class BankAccountForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Membuat objek BankAccount untuk account 1
        BankAccount bankaccount = new BankAccount();

        System.out.println("Welcome to Bank Sinseki\n");

        // Membuat akun bank pertama
        System.out.println("Make Bank Account:");
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        bankaccount.setName(name);

        System.out.print("Your deposit: $");
        int balance = scanner.nextInt();
        bankaccount.setBalance(balance);
        scanner.nextLine(); // Konsumsi newline yang tersisa

        int id = random.nextInt(100) + 1; // Menghasilkan ID acak
        bankaccount.setId(id);
        System.out.println("\n");

        // Menampilkan detail akun pertama
        bankaccount.Account();
        System.out.println("\n");

        // Membuat objek BankAccount untuk account 2
        BankAccount bankAccount1 = new BankAccount();

        // Membuat akun bank kedua
        System.out.println("Make Bank Account:");
        System.out.print("Input your name: ");
        name = scanner.nextLine();
        bankAccount1.setName(name);

        System.out.print("Your deposit: $");
        balance = scanner.nextInt();
        bankAccount1.setBalance(balance);
        id = random.nextInt(100) + 1; // Menghasilkan ID acak
        bankAccount1.setId(id);
        System.out.println("\n");

        // Menampilkan detail akun kedua
        System.out.println("\nYour account:");
        System.out.println("ID: " + bankAccount1.getId());
        System.out.println("Name: " + bankAccount1.getName());
        System.out.println("\n");

        // Menampilkan menu interaktif untuk pengguna
        int choose = 0;
        for (int i = choose; i != 5; i = choose) {
            System.out.println("Welcome, back " + bankaccount.getName());
            System.out.println("MENU:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Transfer");
            System.out.println("4. Balance");
            System.out.println("5. Delete Account");
            System.out.println("choose(1,2,3,4,5):");
            choose = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline yang tersisa

            if (choose == 1) {
                // Opsi untuk menambah kredit ke akun
                System.out.print("Amount: $");
                int amount = scanner.nextInt();
                bankaccount.setAmount(amount);
                bankaccount.Credit(amount);
                System.out.println("Total Balance now: $" + bankaccount.getBalance());
                System.out.println("\n");
            } else if (choose == 2) {
                // Opsi untuk menarik uang dari akun
                System.out.println("Amount: $ ");
                int amount = scanner.nextInt();
                bankaccount.setAmount(amount);
                if (amount <= bankaccount.getBalance()) {
                    bankaccount.Debit(amount);
                    System.out.print("Total balance now: $" + bankaccount.getBalance());
                } else {
                    System.out.println("Amount exceed balance");
                    System.out.println("Your balance: " + bankaccount.getBalance());
                }
                System.out.println("\n");
            } else if (choose == 3) {
                // Opsi untuk mentransfer uang ke akun lain
                System.out.print("Amount to transfer: $");
                int amount = scanner.nextInt();
                if (amount <= bankaccount.getBalance()) {
                    bankaccount.TransferTo(bankAccount1, amount);
                    System.out.println("After Transfer:");
                    System.out.println(bankaccount);
                    System.out.println(bankAccount1);
                } else {
                    System.out.println("Amount exceeded balance");
                }
                System.out.println();
            } else if (choose == 4) {
                // Opsi untuk menampilkan saldo akun
                System.out.println("Information:");
                System.out.println(bankaccount);
                System.out.println();
            } else if (choose == 5) {
                // Opsi untuk menghapus akun
                System.out.println("Your account has been deleted");
            } else {
                // Opsi jika pengguna memasukkan pilihan yang tidak valid
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
