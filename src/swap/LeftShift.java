package swap;

import java.util.Scanner;

public class LeftShift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many index number:");
        int length = sc.nextInt();
        System.out.println();
        int[] A = new int[length];//Create array

        for (int i = 0; i < length; i++) {
            System.out.print("Enter value " + (i + 1) + ".");
            A[i] = sc.nextInt();

        }
        System.out.print("Before Shift:");
        for (int j = 0; j < length; j++) {
            System.out.print(A[j] + ",");
        }
        int temp = A[0];//start swap
        for (int k = 0; k < length - 1; k++) {
            A[k] = A[k + 1];
        }
        A[length - 1] = temp;
        System.out.println();
        System.out.print("After Shift:");
        for (int j = 0; j < length; j++) {
            System.out.print(A[j] + ",");

        }


    }
}




