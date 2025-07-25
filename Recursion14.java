import java.util.Scanner;

public class Recursion14 {
    static int sumSquares(int n) {
        if (n == 0) return 0;
        return (n * n) + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Sum of squares of first " + n + " numbers is " + sumSquares(n));
        sc.close();
    }
}