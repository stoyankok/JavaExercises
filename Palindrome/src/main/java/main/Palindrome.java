package main;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        boolean a = isPalindrome("abc");
        boolean b = isPalindrome("abba");
        System.out.println(a);
        System.out.println(b);
    }
}

