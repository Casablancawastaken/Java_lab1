package java_labs.Lab1;

public class Palindrome {
    public static void main(String[] args) {
        String s = args[0];
        String[] words = s.split("\\s+");

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println("Строка " + word + " является палиндромом.");
            }
            else {
                System.out.println("Строка " + word + " не является палиндромом.");
            }
        }

    }

    public static String reverseString(String s){
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
