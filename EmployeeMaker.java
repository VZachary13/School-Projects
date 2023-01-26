import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;

public class EmployeeMaker {
    public static void main (String[] args) {
        openingMessage();
        ProductionWorker emp1 = new ProductionWorker(getEmpName(), getEmpNumber(), getEmpShift(), getEmpPay());

        displayEmployee(emp1);
    }

    public static void openingMessage(){
        System.out.println("You are now creating a Production Worker Employee");

    }

    public static String getEmpName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your employee name.");
        String name = sc.next();
        return name;

    }
    
    public static Integer getEmpNumber(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number <= 10000 || number > 99999) {
            System.out.println("Please enter your 5 digit employee number.");
            number = sc.nextInt();
        }
        return number;

    }

    public static Integer getEmpShift(){
        Scanner sc = new Scanner(System.in);
        int shift = 0;
        while (shift != 1 && shift != 2) {
            System.out.println("Please enter your shift time.");
            System.out.println("1 for Day");
            System.out.println("2 for Night");
            shift = sc.nextInt();
        }
        return shift;

    }
    
    public static double getEmpPay(){
        Scanner sc = new Scanner(System.in);
        double pay = 0;
        while (pay <= 0) {
        System.out.println("Please enter your hourly pay");
            pay = sc.nextDouble();
        }
        return pay;

    }

    public static void displayEmployee(ProductionWorker emp1) {
        displayEmpName(emp1);
        displayEmpNumber(emp1);
        displayEmpShift(emp1);
        displayEmpPay(emp1);
    }

    public static void displayEmpName(ProductionWorker emp1) {
        System.out.println("Employee name: "+emp1.getName());
    }

    public static void displayEmpNumber(ProductionWorker emp1) {
        System.out.println("Employee number: "+emp1.getNumber());
    
    }

    public static void displayEmpShift(ProductionWorker emp1) {
        Integer shift = emp1.getShift();
        if (shift == 1) {
            System.out.println("Employee shift: Day");
        } else{
            System.out.println("Employee shift: Night");
        }
        
    
    }

    public static void displayEmpPay(ProductionWorker emp1) {
        DecimalFormat ft = new DecimalFormat("00.00");
        System.out.println("$"+ft.format(emp1.getPay()));
    
    }
	

}

public class Employee {
    protected String name;
    protected Integer number;

    public Employee (String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public final void setName (String newName) {
        this.name = newName;
    }

    public final void setNumber(Integer newNumber) {
        this.number = newNumber;
    }

    public final String getName() {
        return name;
    }

    public final Integer getNumber() {
        return number;
    }

}

public class ProductionWorker extends Employee {
    private Integer shift;
    private double hrPay;

    
    public ProductionWorker (String name, Integer number, Integer shift, double hrPay) {
        super(name, number);
        this.shift = shift;
        this.hrPay = hrPay;
    }

    public void setShift(Integer newShift) {
        this.shift = newShift;
    }

    public void setPay(double newPay) {
        this.hrPay = newPay;
    }
    
    public Integer getShift() {
        return shift;
    }

    public double getPay() {
        return hrPay;
    }

}

