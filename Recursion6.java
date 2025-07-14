import java.util.Scanner;

public class Recursion6 {
    static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is " + sumN(n));
        sc.close();
    }
}