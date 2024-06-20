package Array;

import java.util.Scanner;
public class student {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students?");
        int length = sc.nextInt();
        String [] students = new String [length];
        for(int i=0; i<length; i++) {
            System.out.print("Enter student "+(i+1)+" name:");
            students [i] = sc.next();
        }
        System.out.println("All Students");
        System.out.println("NO   Name");
        System.out.println("==   ====");
        for(int j=0; j<length; j++) {
            System.out.println((j+1)+"    "+students[j]);

        }


    }

}

