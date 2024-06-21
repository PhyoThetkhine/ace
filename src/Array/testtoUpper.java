package Array;

import java.util.Scanner;

public class testtoUpper {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value number:");
        int length = sc.nextInt();
        String [] A = new String[length];


        for (int i=0; i<length; i++) {

            System.out.print("Enter value " + (i + 1) + " number:");
            A[i] = sc.next();
        }
        System.out.print("Your enter numbers are ");
        for (int j=0 ;j<length; j++){
            A [j] = A[j].toUpperCase();
            System.out.print(A[j]);

        }



    }
}
