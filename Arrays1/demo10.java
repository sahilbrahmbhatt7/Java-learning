// create a program to find the sum of two diagonal element.

import java.util.Scanner;

public class demo10 {

    
    public static void diagonalSum(int[][] arr) {

        int primarySum = 0;
        int secondarySum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            primarySum = primarySum + arr[i][i];              
            secondarySum = secondarySum + arr[i][n - 1 - i];  
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        diagonalSum(matrix);
    }
}

