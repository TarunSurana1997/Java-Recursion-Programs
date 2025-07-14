import java.util.Scanner;

public class Recursion9 {
    static void printEven(int n) {
        if (n < 2) return;
        printEven(n - 2);
        if (n % 2 == 0)
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printEven(n);
        System.out.println();
        sc.close();
    }
}