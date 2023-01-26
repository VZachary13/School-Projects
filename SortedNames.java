import java.util.*;
import java.lang.*;

public class SortedNames {
    public static void main(String[] args) {
        int yORn = 1;
        do {
            String[] arr = new String[20];
            System.out.println("Please enter 20 names.");
            Scanner in = new Scanner(System.in);
            for (int x = 0; x < arr.length; ++x){
                int y = 20 - x;
                System.out.println(y+" names remaining.");
                arr[x] = in.next();
            }

            Arrays.sort(arr);

            
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[x]+" ");
            }
            
            while (yORn == 1) {
                yORn = checkArray(arr);
            }
            System.out.println("Would you like to make a new list of names?");
            System.out.println("Press 1 for yes");
            System.out.println("Press 0 for no");
            yORn = in.nextInt();
        } while (yORn == 1);
    }

    public static int checkArray(String[] arr) {
        int yORn = 0;
        String check = "duh";
        Scanner in = new Scanner(System.in); 
        String[] arr1 = arr;   
        System.out.println("\n"+"Would you like to search for a name?");
        System.out.println("1 for yes");
        System.out.println("0 for no");
        yORn = in.nextInt();
        if (yORn == 0) {
            return 0;
        }

        System.out.println("Please enter a valid name.");
        check = in.next();
        
        if(Arrays.asList(arr1).contains(check)){
            System.out.println("Name found!");  
        }else {
            System.out.println("Name not found!");
        }

            
        
        System.out.println("Press 1 to search again");
        System.out.println("Press 0 to end");
        yORn = in.nextInt();
        if (yORn == 0) {
            return 0;
        } else {
            return 1;
        }

    }
    
}
