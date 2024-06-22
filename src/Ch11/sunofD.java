package Ch11;

import java.util.Scanner;

public class sunofD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit number:");
        int userinput = sc.nextInt();
        System.out.println("The sum of digits of "+userinput+" is "+SumOfDigits(userinput));
    }
    public static int  SumOfDigits(int number) {
        int sum =0;
        while (number != 0){
            sum += number%10;
            number /= 10;
        }
        return sum;

    }


}