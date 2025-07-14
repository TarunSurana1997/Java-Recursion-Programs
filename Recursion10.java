import java.util.Scanner;

public class Recursion10 {
    static void printReverse(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        printReverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n == 0)
            System.out.print(0);
        else
            printReverse(n);
        System.out.println();
        sc.close();
    }
}