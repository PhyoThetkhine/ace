package Ch11;
import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("1=+,2=-,3=*,4=/.");
        int operator = sc.nextInt();

        switch (operator){
            case 1:
                Add(number1,number2);
                break;
            case 2:
                M(number1,number2);
                break;
            case 3:
                Me(number1,number2);
                break;
            case 4:
                Diviser(number1,number2);
                break;
            default:
                System.out.println("Wrong!");
                break;

        }
    }
    public static void Add(int a, int b){
        System.out.println("Ans:"+(a+b));
    }
    public static void M(int a, int b){
        System.out.println("Ans:"+(a-b));
    }
    public static void Me(int a, int b){
        System.out.println("Ans:"+(a*b));
    }
    public static void Diviser(int a, int b){
        System.out.println("Ans:"+(a/b));
    }
}
