package Ch11;

import java.util.Scanner;

public class rearch {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of value:");
        int length = sc.nextInt();
        int [] A = new int[length];
        for(int i=0; i<length;i++){
            System.out.print("Enter value "+(i+1)+":");
            A[i] =sc.nextInt();
        }
        System.out.println("Enter the number you want to rearch.");
        int number = sc.nextInt();
        rearch(A,number);
    }
    public static int rearch (int [] A, int rearchnumber) {
        boolean found = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == rearchnumber) {
                System.out.println("The number that you want to know is at " + (i + 1));
                found = true;
                return i;
            }

        }
        if (found != true) {
            System.out.println("Not found the number.");
        }
    return -1;
    }

}







