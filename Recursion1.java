package Java.Recursions;
import java.util.Scanner;

public class Recursion1 {
    static void printHello(int n) {
        if (n <= 0) return;
        System.out.println("Hello my dear");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printHello(n);
        sc.close();
    }
}