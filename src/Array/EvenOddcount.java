package Array;

import java.util.Scanner;

public class EvenOddcount {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int Evencount = 0;
        int Oddcount = 0;
        System.out.print("Enter value number:");
        int length = sc.nextInt();
        int [] A = new int[length];

        for(int i=0; i < length; i++){
            System.out.print("Enter "+(i+1)+"value:");
            A[i] = sc.nextInt();
            if(A[i] % 2 == 0){
                Evencount++;
            }else{
                Oddcount++;
            }
        }
        System.out.println("Count of even number:"+Evencount);
        System.out.println("Count of odd number:"+Oddcount);
        System.out.println("Maybe I was wrong.");


    }
}
