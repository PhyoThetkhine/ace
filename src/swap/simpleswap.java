package swap;
import java.util.Scanner;
public class simpleswap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value that you want to swap.");
        System.out.print("Enter value a:");
        int a = sc.nextInt();
        System.out.print("Enter value b:");
        int b = sc.nextInt();
        int temp = 0 ;
        temp =a ;
        a =b;
        b =temp;


        System.out.println("Result: a="+a+". b="+b+".");





    }

}