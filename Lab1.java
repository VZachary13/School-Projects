// imports
import java.util.Scanner;

public class Lab1 {
    //global scanner obj
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {

        //required functions
        displayWelcomeMessage();
        String userName = getString();
        displayResult(getInteger(userName), getRandomNumber());
        displayGoodbyeMessage(userName);
    }

    //function creation
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the land of BEES!"+"\n"+ "What is your name adventurer?");

    }

    public static String getString() {
        return keyboard.nextLine();    
    }

    public static Integer getInteger(String name) {
        System.out.println("How many bees, between 0 and 1000, do you think live in the hive, "+name+"?");
        int num = 0;
            if (keyboard.hasNextInt()) {
                num = keyboard.nextInt();
                while (num > 1000 || num < 0) {
                    System.out.println("Please enter a whole number between 0 and 1000.");
                    num = keyboard.nextInt();
                }
            } else {
                System.out.println("Please enter a NUMBER.");
                System.exit(0);
            }
        return num;

    }

    public static Integer getRandomNumber() {
        int min = 0;
        int max = 1000;
        double dbl = Math.floor(Math.random()*(max-min+1)+min);
        return (int)dbl;

    }

    public static void displayResult(int num1, int num2) {
        int diff = Math.abs(num1 - num2);
        // "win-loss" condition
        if (diff == 0) {
            System.out.println("Wow! you were spot on!");
        } else {
            System.out.println("There are "+num2+" bees in the hive."+"\n"+"You were off by "+diff+".");
        }
        

    }

    public static void displayGoodbyeMessage(String name) {
        System.out.println("Thank you for your guess! Hope to see you around "+name+"!");
    } 
}
