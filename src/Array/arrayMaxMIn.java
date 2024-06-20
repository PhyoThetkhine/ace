package Array;
import java.util.Scanner;
public class arrayMaxMIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        double average = 0;
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("How many index.:");
        int length = sc.nextInt();
        int [] A = new int [length];

        for(int i=0; i<length; i++) {
            System.out.println("Enter value "+(i+1));
            A [i] = sc.nextInt();

            total += A[i];

            if (max < A[i]) {
                max = A[i];
            }

            if (min > A[i]) {
                min = A[i];
            }

        }
        System.out.print("Your value are ");
        for(int j=0; j<length; j++) {
            System.out.print(A[j]+",");

        }
        System.out.println();
        System.out.println("Total:"+total);
        average = total/length;
        System.out.println("Average:"+average);
        System.out.println("Max value:"+max);
        System.out.println("Min value:"+min);

    }

}
