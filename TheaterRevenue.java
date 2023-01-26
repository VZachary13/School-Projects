import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;

public class TheaterRevenue {
    //Declaration of Constants
    static final double SECAP = 20;
    static final double SECBP = 15;
    static final double SECCP = 10;
    static final int SECAS = 300;
    static final int SECBS = 500;
    static final int SECCS = 200;
    static final String SECAN = "Section A";
    static final String SECBN = "Section B";
    static final String SECCN = "Section C";

    //Scanner Obj
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) {
        //Display total seating and pricing
        DecimalFormat ft = new DecimalFormat("0.00");
        System.out.println("section A seats cost $"+ft.format(SECAP)+" each"+"\n"+"section B seats cost $"+ft.format(SECBP)+" each"+"\n"+"section C seats cost $"+ft.format(SECCP)+" each");
        System.out.println(SECAS+" seats in section A"+"\n"+SECBS+" seats in section B"+"\n"+SECCS+" seats in section C");

        try {
        totalRev(SECAP, SECBP, SECCP, SECAS, SECBS, SECCS, SECAN, SECBN, SECCN);
        } catch (Exception e){
            System.out.println("Look at what you did!");
        }

    }

    //revenue module
    public static void totalRev (double num1, double num2, double num3, int numA, int numB, int numC, String in1, String in2, String in3) {
    
        //Getting seats sold user input
        int input1 = -1;
        int input2 = -1;
        int input3 = -1;
        int doAgain = 0;
        int sRem1 = numA;
        int sRem2 = numB;
        int sRem3 = numC;

        double rev1 = 0;
        double rev2 = 0;
        double rev3 = 0;
        double totRev = 0;

        String err = "Please enter a valid NUMBER";
        do {
            //input1
            System.out.println("How many seats were sold in "+in1+"?");   
            if (sc.hasNextInt()) {
                input1 = sc.nextInt();
                while (input1 > numA || input1 < 0) {
                    System.out.println("Please enter a whole number between 0 and "+numA+".");
                    input1 = sc.nextInt();
                }
            } else {
                System.out.println(err);
                System.exit(0);
            }
        
        

            //input2
            System.out.println("How many seats were sold in "+in2+"?");
            if (sc.hasNextInt()) {
                input2 = sc.nextInt();
                while (input2 > numB || input2 < 0) {
                    System.out.println("Please enter a whole number between 0 and "+numB+".");
                    input2 = sc.nextInt();
                }
            } else {
                System.out.println(err);
                System.exit(0);
            }

            //input3
            System.out.println("How many seats were sold in "+in3+"?");
            if (sc.hasNextInt()) {
                input3 = sc.nextInt();
                while (input3 > numC || input3 < 0) {
                    System.out.println("Please enter a whole number between 0 and "+numC+".");
                    input3 = sc.nextInt();
                }
            } else {
                System.out.println(err);
                System.exit(0);
            }
            //beginning of calculations
            sRem1 = sRem1 - input1;
            sRem2 = sRem2 - input2;
            sRem3 = sRem3 - input3;

            rev1 = rev1+(input1*num1);
            rev2 = rev2+(input2*num2);
            rev3 = rev3+(input3*num3);
            totRev = rev1 + rev2 + rev3 + totRev;

            
            DecimalFormat ft = new DecimalFormat(",000.00");
            System.out.println(in1+" revenue: $"+ft.format(rev1)+ " with "+sRem1+" seats remaining.");
            System.out.println(in2+" revenue: $"+ft.format(rev2)+ " with "+sRem2+" seats remaining.");
            System.out.println(in3+" revenue: $"+ft.format(rev3)+ " with "+sRem3+" seats remaining.");
            System.out.println("Total revenue: $"+ft.format(totRev)+ " with "+(sRem1+sRem2+sRem3)+" total seats remaining.");
            System.out.println("\n"+"Would you like to add any more seats sold?"+"\n"+"1 for yes"+"\n"+"or 0 for N");

            try {
            int yORn = sc.nextInt();
            if (yORn == 1) {
                doAgain = 1;
            } else {
                doAgain = 0;
            }
            } catch (Exception e) {
                System.out.println("Bruh it was 1 or 0");
            }
            
        } while (doAgain == 1);
    }
    
}
