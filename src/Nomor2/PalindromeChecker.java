package Nomor2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();
        scanner.close();
        palindrome.isPalindrome(kata);

        System.out.println("Apakah " + kata + " palindrome? " + palindrome.isPalindrome(kata));

//
    }
}
