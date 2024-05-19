package Nomor2;

// Class untuk mengecek apakah sebuah kata merupakan palindrome atau bukan
public class Palindrome {

    // Method untuk mengecek apakah sebuah kata merupakan palindrome
    public boolean isPalindrome(String kata) {
        int length = kata.length(); // Menghitung panjang kata
        // Iterasi setengah panjang kata
        for (int i = 0; i < length / 2; i++) {
            // Membandingkan karakter pertama dengan karakter terakhir,
            // kedua dengan kedua dari akhir, dan seterusnya
            if (kata.charAt(i) != kata.charAt(length - i - 1)) {
                return false; // Jika ada perbedaan, kata bukan palindrome
            }
        }
        return true; // Jika tidak ada perbedaan, kata merupakan palindrome
    }
}
