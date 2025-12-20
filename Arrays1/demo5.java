// create a program to reverse an array

import java.util.Scanner;

public class demo5 {

   
    public static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];

       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        int[] result = reverseArray(nums);

        System.out.println("Reversed array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
