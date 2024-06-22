package Ch11;


import java.util.Scanner;

public class reversesarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int length = sc.nextInt();
        int[] A = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.print("Before reverse: ");
        for (int j = 0; j < length; j++) {
            System.out.print(A[j] + " ");
        }
        System.out.println();
        reverse(A);
        System.out.print("After reverse: ");
        for (int j = 0; j < length; j++) {
            System.out.print(A[j] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }

    }
}
