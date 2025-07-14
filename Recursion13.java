import java.util.Scanner;

public class Recursion13 {
    static void printArray(int[] arr, int n, int index) {
        if (index == n) return;
        System.out.print(arr[index] + " ");
        printArray(arr, n, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        printArray(arr, n, 0);
        System.out.println();
        sc.close();
    }
}