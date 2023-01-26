import java.util.*;
import java.lang.*;

public class WhyWontYouWork{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Int makePet = 1;
        System.out.println("Would you like to create a pet?");
        System.out.println("Press 1 for yes");
        System.out.println("Press 0 for no");
        try {
            makePet = sc.nextInt();

            while (makePet == 1) {
                
                System.out.println("What is your pet's name?");
                String petName = sc.next();
        
                System.out.println("What kind of pet is it? (Dog, Cat, etc.)");
                String petType = sc.next();
        
                System.out.println("What is your pet's age?");
                Integer petAge = sc.nextInt();
        
                Pet Animal = new Pet(petName, petType, petAge);
                System.out.println("The pet name is "+Animal.getName());
                System.out.println("The pet type is "+Animal.getType());
                System.out.println("The pet age is "+Animal.getAge());
                System.out.println("Would you like to create another pet?");
                System.out.println("Press 1 for yes");
                System.out.println("Press 0 for no");
                makePet = sc.nextInt();
            }
        } catch (Exceptions e) {
            System.out.println("Please make VALID entries");
        }
    }

    
}

class Pet {
    private String name;
    private String type;
    private Int age;

    public Pet(String nIn, String tIn, Int ageIn) {
        name = nIn;
        type = tIn;
        age = ageIn;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setAge(Int newAge){
        this.age = newAge;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public Int getAge(){
        return age;
    }
    
}