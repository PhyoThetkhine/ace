package Ch11;

import java.util.Scanner;

public class CalculatorSalary {
    public static final int MaxTime = 160;
    public static final double engineerHourlyPay = 30;
    public static final double technicianHourlyPay = 25.5;
    public static final double overtimerate =1.5;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("If your are engineer enter 1 or If your are technician enter 2.");
        int define = sc.nextInt();

        switch (define){
            case 1:
                System.out.print("Enter your hourwork.");
                int hourwork = sc.nextInt();
                double salary = EngineerSalary(hourwork);
                System.out.println("You got $"+salary);
                break;
            case 2:
                System.out.print("Enter your hourwork.");
                int tehourwork = sc.nextInt();
                double tesalary = TechnicianSalary(tehourwork);
                System.out.println("You got $"+tesalary);
                break;
        }

    }
    public static double EngineerSalary(int hoursWorked) {
        if (hoursWorked <= MaxTime) {
            return hoursWorked * engineerHourlyPay;
        } else {
            double regularPay = MaxTime * engineerHourlyPay;
            double overtimePay = (hoursWorked - MaxTime) * (engineerHourlyPay * overtimerate);
            return regularPay + overtimePay;
        }
    }
        public static double TechnicianSalary(int hourwork) {
            if (hourwork <= MaxTime) {
                return hourwork * technicianHourlyPay;
            } else {
                double regularPay = MaxTime * technicianHourlyPay;
                double overtimePay = (hourwork - MaxTime) * (technicianHourlyPay * overtimerate);
                return regularPay + overtimePay;
            }


        }
    }


