// create a program to to search an element in 2-d array.


import java.util.Scanner;

public class demo8 {

    
    public static boolean searchElement(int[][] arr, int key) {

        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {  
                if (arr[i][j] == key) {
                    System.out.println("Element found at position: Row "
                            + i + ", Column " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        
        System.out.println("Enter elements of 2-D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int key = input.nextInt();

        if (!searchElement(matrix, key)) {
            System.out.println("Element not found in the 2-D array.");
        }
    }
}
