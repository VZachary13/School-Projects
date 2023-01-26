import java.util.Collections;
import java.util.ArrayList;
public class Lottery {
    public static void main(String[] args) {
        //define ArrayList to hold Integer objects
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 89; i++) {
        numbers.add(i+1);
        }

        Collections.shuffle(numbers);
        System.out.print("This week's lottery numbers are: ");
        
        for(int j =0; j < 6; j++) {
        System.out.print(numbers.get(j) + " ");
        }
    }
}