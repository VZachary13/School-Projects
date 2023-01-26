import java.util.*;
import java.lang.*;

public class ArrayMadness {
    public static void main(String[] args) {

        int doAgain = 0;
        int searchAgain = 0;
        Scanner sc = new Scanner(System.in);

        do {
            int[] arr = makeArray();
            displayArray(arr);
            mathArray(arr);
            do{
                try{
                searchArray(arr);
                
                System.out.println("Would you like to search another number?");
                System.out.println("Press 1 for yes");
                System.out.println("Press 0 for no");
                searchAgain = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Please enter a NUMBER");
                }

            } while (searchAgain == 1);


            System.out.println("Would you like to make another array?");
            System.out.println("1 for yes");
            System.out.println("0 for no");
            doAgain = sc.nextInt();
        } while (doAgain != 0);
    }

    public static void mathArray(int[] arr) {

        Arrays.sort(arr);

        int sum=0;
        
        int high= arr[arr.length-1];
        int low= arr[0];
        int even=0;
        int odd=0;

        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }

        int avg= sum / arr.length;

        for (int x = 0; x < arr.length; x++) {
            int mod = arr[x] % 2;
            if (mod == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        displayOutputReport(sum, avg, high, low, even, odd);
    }
    
    public static void displayOutputReport(int sum, int avg, int high, int low, int even, int odd) {
        System.out.println("The sum of values in the array is "+sum);
        System.out.println("The average of the value of the array is "+avg);
        System.out.println("The highest value in the array is "+high);
        System.out.println("The lowest value in the array is "+low);
        System.out.println("There are "+odd+" odd numbers and "+even+" even numbers");
    }

    public static void displayArray (int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]+" ");
        }
        System.out.println("\n");
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("\n");

    }

    public static int[] makeArray() {
        int [] arr = new int[10];
        //define ArrayList to hold Integer objects
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 89; i++) {
        numbers.add(i+10);
        }

        Collections.shuffle(numbers);

        for (int x = 0; x < 10; x++) {

            arr[x] = (int)numbers.get(x);
        }

        return arr;
    }

    public static void searchArray(int[] arr) {
        int guess = -1;
        System.out.println("What number, between 10 and 99, would you like to search for?");
        System.out.println("Enter 0 to exit.");
        Scanner in = new Scanner(System.in);
            try {
            guess = in.nextInt();
            if (guess == 0) {
                return;
            }
            while (guess < 10 || guess > 99) {
                System.out.println("Please enter a valid whole number between 10 and 99 or press 0 to exit.");
                
                guess = in.nextInt();
                if (guess == 0) {
                    System.exit(0);
                }   
            }
            int check = 0;
            for (int x = 0; x < arr.length; x++) {
                
                if (arr[x] == guess) {
                    System.out.println("Number was found!");
                    check++;
                } 
                if (x == arr.length-1 && check == 0){
                    System.out.println("Number was not found!");
                }
            }
            } catch (Exception e) {
                System.out.println("Please enter a whole NUMBER");
            }
    }
}