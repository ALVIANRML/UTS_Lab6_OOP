package Nomor2;

public class Palindrome {
    public boolean isPalindrome(String kata) {
        int length = kata.length();
        for (int i = 0; i < length / 2; i++) {
            if (kata.charAt(i) != kata.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
