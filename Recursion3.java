import java.util.Scanner;

public class Recursion3 {
    static void print1toN(int n) {
        if (n <= 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        print1toN(n);
        System.out.println();
        sc.close();
    }
}