package Array;

import java.util.Scanner;

public class shorting {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many index number:");
        int length = sc.nextInt();
        System.out.println();
        int[] A = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter value " + (i + 1) + ".");
            A[i] = sc.nextInt();
        }
        System.out.print("Before sorting:");
        for (int j = 0; j < length; j++) {
            System.out.print(A[j] + ",");
        }
        for(int k=0; k<length-1; k++){
            for(int h=k+1; h<length; h++){
                if (A[h]<A[k]) {
                    int temp = A[0];
                    temp=A[h];
                    A[h]=A[k];
                    A[k] = temp;

                }
            }
        }
                System.out.println();
                System.out.print("After sorting:");
                for (int j = 0; j < length; j++) {
                    System.out.print(A[j] + ",");

                }

            }



        }






