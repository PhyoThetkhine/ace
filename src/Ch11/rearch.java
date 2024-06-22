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
        System.out.print("Enter the number that you want to know position :");
        int searchnumber = sc.nextInt();
        boolean found = false;
        for (int i =0; i<length;i++){
            if(A[i]==searchnumber){
                System.out.println("The number is at "+(i+1));
                found=true;
            }
        }
        if(found!=true){
            System.out.println("Not found your number.");
        }
    }
}
