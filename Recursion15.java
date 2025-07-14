import java.util.Scanner;

public class Recursion15 {
    static boolean isPalindromeHelper(int n, int[] rev) {
        if (n == 0) return true;
        boolean res = isPalindromeHelper(n / 10, rev);
        rev[0] = rev[0] * 10 + (n % 10);
        return res;
    }

    static boolean isPalindrome(int n) {
        int[] rev = {0};
        isPalindromeHelper(n, rev);
        return n == rev[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
        sc.close();
    }
}