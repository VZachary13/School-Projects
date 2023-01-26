import java.util.*;

public class RandGenerator {
    public static void main (String[] args) {
        //define ArrayList to hold Integer objects
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 40; i++) {
        numbers.add(i+1);
        }
        Collections.shuffle(numbers);
        System.out.print("This week's lottery numbers are: ");
        for(int j =0; j < 6; j++){
        System.out.print(numbers.get(j) + " ");
        }
        
    }
    
}
