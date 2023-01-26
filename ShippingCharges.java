import java.util.Scanner; 
import java.text.DecimalFormat;

public class ShippingCharges {

    public static void main(String[] args) {
        try {
        //User input
        System.out.println("Please enter package weight in pounds(Lbs).");
        Scanner sc = new Scanner(System.in);
        double packLbs = sc.nextDouble();
        //Beginning of if statements
        DecimalFormat ft = new DecimalFormat("0.00");
        if (packLbs <= 2) {
            while (packLbs <= 0) {
                System.out.println("Please enter a number greater than 0.");
                packLbs = sc.nextDouble();
            }
            double lightPack = 1.10*packLbs;
            System.out.println("Your shipping will cost $"+ft.format(lightPack));
        } else if (packLbs <= 6) {
            double medPack = 2.20*packLbs;
            System.out.println("Your shipping will cost $"+ft.format(medPack));
        } else if (packLbs <= 10) {
            double hvyPack = 3.70*packLbs;
            System.out.println("Your shipping will cost $"+ft.format(hvyPack));
        } else {
            double bigPack = 3.80*packLbs;
            System.out.println("Your shipping will cost $"+ft.format(bigPack));
        }
        } catch (Exception e) {
            System.out.println("Please enter a NUMBER greater than 0");
        }



    }
}