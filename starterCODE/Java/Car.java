import java.util.Scanner;

public class Car {

    /*
    this is a basic java program that demonstrates how objects work in java 
    for this example it will be a car object that uses car attributes. 
    */

    private int CYLINDERS;
    private final int MAX_CYLINDERS = 8;
    private final int MIN_CYLINDERS = 4;
    private String MAKE;
    private double PRICE;
    private final double MIN_PRICE = 1; 

    public Car() {
        CYLINDERS = 0;
        MAKE = " ";
        PRICE = 0;
    }

    public Car(int tempCYLINDERS, String tempMAKE, double tempPRICE, int tempDOORS) {
        setCYLINDERS(tempCYLINDERS);
        setMAKE(tempMAKE);
        setPRICE(tempPRICE);
    }

    public void setCYLINDERS(int tempCYLINDERS) {

        if (tempCYLINDERS <= MAX_CYLINDERS && tempCYLINDERS >= MIN_CYLINDERS) {
            CYLINDERS = tempCYLINDERS;
        } else {
            System.out.println("Error, cylinders must be between 4 and 8 ");
        }
}

    public void setMAKE(String tempMAKE) {

        MAKE = tempMAKE;
    }

    public void setPRICE(double tempPRICE) {
        if (tempPRICE >= MIN_PRICE) {
            PRICE = tempPRICE;
        } else {
            System.out.println("ERROR, a negative number was entered,"
                    + "\nplease enter a positve number for price.");
        }
    }
    
    public int getCYLINDERS() {
        return CYLINDERS;
    }

    public String getMAKE() {
        return MAKE;
    }

    public double getPRICE() {
        return PRICE;
    }
    
    
    public String toString() {
        return "MAKE: " + getMAKE() + ", CYLINDER: " + getCYLINDERS() + ", PRICE: $" + getPRICE();
    }
    /*
    this should be the end of the car class, main can be in another class 
    but to keep it simple its just in the same class
    */
   
    public static void main(String[] args) {
        Car car1 = new Car();                   // car object 1 
        //Car car2 = new Car();                   // car object 2 
        Scanner input = new Scanner(System.in); // scanner object used to get input

        System.out.println("Used car search");
        System.out.print("Enter make of car: ");
        car1.setMAKE(input.next());             //set the make of the car 
        
        System.out.print("Enter number of cylinders: ");
        car1.setCYLINDERS(input.nextInt());     //set the cylinders 
        
        System.out.print("Enter desired Price: ");
        car1.setPRICE(input.nextDouble());      //set price 
        
        System.out.println(car1.toString());    // print the new car object 
        
    }
}