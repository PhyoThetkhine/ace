package Ch11;
import java.util.Scanner;
public class returnCalculoator {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = sc.nextInt();
        System.out.print("Enter second number:");
        int number2 = sc.nextInt();
        System.out.print("1=+,2=-,3=*,4=/.");
        int operator = sc.nextInt();
        switch (operator){
            case 1:
                System.out.println(Add(number1,number2));
                break;
            case 2:
                System.out.println(M(number1,number2));
                break;
            case 3:
                System.out.println(Me(number1,number2));
                break;
            case 4:
                System.out.println(Diviser(number1,number2));
                break;
            default:
                System.out.println("Wrong!");
                break;
        }
    }
    public static int Add(int a, int b){
       return (a+b);
    }
    public static int M(int a, int b){
        return (a-b);
    }
    public static int Me(int a, int b){
        return (a*b);
    }
    public static int Diviser(int a, int b){
        return (a/b);
    }
}
