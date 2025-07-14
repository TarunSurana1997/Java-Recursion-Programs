import java.util.Scanner;

public class Recursion11 {
    static long productN(int n) {
        if (n == 0) return 1;
        return n * productN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Product of first " + n + " natural numbers is " + productN(n));
        sc.close();
    }
}