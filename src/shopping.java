import java.util.Scanner;

public class shopping {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int totalamount = 0;
        double average = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("How many items did you buy today?");
        int itemamount = sc.nextInt();

        for(int i=1; i<=itemamount;i++){
            System.out.println("Enter item "+i+" amount.");
            double amount = sc.nextInt();


            totalamount += amount;

        }

        System.out.println("Total amount:"+totalamount);
        System.out.println("Average amount:"+(totalamount/itemamount));



    }


}
