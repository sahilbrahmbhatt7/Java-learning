import java.util.Scanner;

public class demo3 {

    
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;   
            }
        }
        return true;  
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

        if (isSorted(nums)) {
            System.out.println("The array is SORTED.");
        } else {
            System.out.println("The array is NOT SORTED.");
        }
    }
}
