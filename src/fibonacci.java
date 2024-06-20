import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int f = sc.nextInt();
        System.out.println("Enter the second number.");
        int s = sc.nextInt();
        System.out.println("Enter the count that you want.");
        int count = sc.nextInt();
        System.out.println("F0:"+f);
        System.out.println("F1:"+s);


        for (int i =2; i<=count; i++){
            int t = f+s;
            System.out.println("F"+i+":"+t);
            f=s;
            s=t;



        }



    }

}
