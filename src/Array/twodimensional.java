package Array;

import java.util.Scanner;

public class twodimensional {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length1:");
        int length1 = sc.nextInt();
        System.out.print("Enter length2:");
        int length2 = sc.nextInt();
        int [] [] A = new int [length1] [length2];
        for (int i =0 ; i<length1; i++){
            for(int j=0; j<length2; j++){
                System.out.print("Enter number ");
                A[i][j] =sc.nextInt();
            }
        }
        System.out.print("Your enter numbers are ");
        for (int i=0 ; i<length1; i++){
            for(int j=0; j<length2; j++){
                System.out.print(A[i][j]);
            }

        }







    }
}
