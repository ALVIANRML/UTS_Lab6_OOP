package Nomor2;

import java.util.Scanner;

// Class untuk mengecek apakah sebuah kata merupakan palindrome atau bukan
public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna
        Palindrome palindrome = new Palindrome(); // Membuat objek dari class Palindrome untuk mengecek kata palindrome
        System.out.print("Masukkan kata: "); // Meminta pengguna untuk memasukkan kata
        String kata = scanner.nextLine(); // Membaca kata yang dimasukkan oleh pengguna
        scanner.close(); // Menutup scanner setelah selesai membaca input

        // Memanggil method isPalindrome dari objek palindrome untuk mengecek apakah kata merupakan palindrome atau bukan
        boolean result = palindrome.isPalindrome(kata);

        // Menampilkan hasil pengecekan apakah kata merupakan palindrome atau bukan
        System.out.println("Apakah \"" + kata + "\" palindrome? " + result);
    }
}
