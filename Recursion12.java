import java.util.Scanner;

public class Recursion12 {
    static int sumArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
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
        System.out.println("Sum of array elements is " + sumArray(arr, n));
        sc.close();
    }
}