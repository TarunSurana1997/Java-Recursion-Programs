import java.util.Scanner;

public class Recursion5 {
    static long fib(int n) {
        if (n == 0 || n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number " + n + " is " + fib(n));
        sc.close();
    }
}