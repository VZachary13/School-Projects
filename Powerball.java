import java.util.Random;
public class Powerball {
   public static void main(String[] args) {
      Random rd = new Random(); // creating Random object
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(69); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element
      }
   }
}