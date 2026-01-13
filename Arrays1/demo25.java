import java.util.Scanner;

public class demo25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i = i + 2) {
            sum += arr[i];
        }

        System.out.println("Sum of alternate elements = " + sum);
    }
}
