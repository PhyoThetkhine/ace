package Array;

import java.util.Scanner;

public class Examiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student?");
        int length = sc.nextInt();
        double totalallsub = 0;
        double TotalMy = 0;
        double TotalMath =0;
        double TotalE = 0;
        int highestMark = 0;
        String topStudent = "";


        String[] N = new String[length];
        String[] G = new String[length];
        int[] Myanmarmark = new int[length];
        int[] Mathmark = new int[length];
        int[] Englishmark = new int[length];
        int[] totaleachstudent = new int[length];
        String[] result = new String[length];
        int passcount =0;
        System.out.println("Hello ");
            

        for (int i = 0; i < length; i++) {
            sc.nextLine();
            switch (i) {
                case 0:
                    System.out.print("Enter "+(i+1)+"st student  name: ");
                    N[i] = sc.nextLine();
                    break;
                case 1:
                    System.out.print("Enter "+(i+1)+"nd student  name: ");
                    N[i] = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Enter "+(i+1)+"rd student  name: ");
                    N[i] = sc.nextLine();
                    break;
                default:
                    System.out.print("Enter "+(i+1)+"th student  name: ");
                    N[i] = sc.nextLine();
                    break;

            }
            System.out.print("Enter Gender: ");
            G[i] = sc.nextLine();
            if (G[i].equals("Male") || G[i].equals("male")) {
                System.out.print("Enter Mg " + N[i] + "'s Myanmar mark:");
                Myanmarmark[i] = sc.nextInt();
                System.out.print("Enter Mg " + N[i] + "'s Math mark:");
                Mathmark[i] = sc.nextInt();
                System.out.print("Enter Mg " + N[i] + "'s English mark:");
                Englishmark[i] = sc.nextInt();

            } else {
                System.out.print("Enter Ma " + N[i] + "'s Myanmar mark:");
                Myanmarmark[i] = sc.nextInt();
                System.out.print("Enter Ma " + N[i] + "'s Math mark:");
                Mathmark[i] = sc.nextInt();
                System.out.print("Enter Ma " + N[i] + "'s English mark:");
                Englishmark[i] = sc.nextInt();

            }

            if(Myanmarmark[i] >= 40 && Mathmark[i] >= 40 && Englishmark[i] >= 40){
                result [i] = "Pass";
                passcount++;
            }else {
                result[i] = "Fail";
            }

            totaleachstudent[i] = Myanmarmark[i] + Mathmark[i] + Englishmark[i];
            if (G[i].equals("Male") || G[i].equals("male")) {
                System.out.print("Total mark of Mg " + N[i] + ": " + totaleachstudent[i]+"("+result[i]+")");
            } else {
                System.out.println("Total mark of Ma " + N[i] + ": " + totaleachstudent[i]+"("+result[i]+")");
            }
            System.out.println();
            totalallsub += totaleachstudent[i];
            TotalMy += Myanmarmark[i];
            TotalMath += Mathmark[i];
            TotalE += Englishmark[i];
            if (totaleachstudent[i] > highestMark) {
                highestMark = totaleachstudent[i];
                topStudent = N[i];
            }


        }
        if (passcount!=length){
            System.out.println(passcount+ " out of "+length+" passed the exam.");

        }else {
            System.out.println("All students passed the exam");
        }
        double passrate = 100.0 * passcount / length;
        System.out.println("Passed Rate :"+passrate);
        System.out.println("Average Mark (All subject): "+totalallsub/length);
        System.out.println("Average Myanmar mark: "+TotalMy/length);
        System.out.println("Average Math mark: "+TotalMath/length);
        System.out.println("Average English mark: "+TotalE/length);
        System.out.println("The student with the highest mark is: " + topStudent + " with a total of " + highestMark + " marks.");

        System.out.println("Student Summary");
        System.out.println("Name\t\tGender\tMyanmar\tMath\tEnglish\tTotal\tPassed/Failed");
        System.out.println("====\t\t======\t=======\t====\t=======\t=====\t=============");
        for (int i = 0; i < length; i++) {
            System.out.println(N[i] + "\t" + G[i] + "\t" + Myanmarmark[i] + "\t" + Mathmark[i] + "\t" + Englishmark[i] + "\t" + totaleachstudent[i] + "\t" + result[i]);
        }

    }
}




