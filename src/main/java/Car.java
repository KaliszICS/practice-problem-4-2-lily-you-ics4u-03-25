/**
 * This Car class allows the user to access and modify
 * make, model, year and price of a car.
 * @author Lily You
 * @version 1
 * 
 */
public class Car{
    //instances
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Initializes the values of the variables make, model, year and price
     * @param make String - the make of the car
     * @param model String - the model of the car
     * @param year int - the year the car
     * @param price double - the price of the car
     */

    //constructors
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // getters
    /**
     * Returns the make of the car
     * @return the make of the car as a string
     */
    public String getMake(){
        return this.make;
    }

    /**
     * Returns model of the car
     * @return the model of the car as a string
     */
    public String getModel(){
        return this.model;
    }

    /**
     * Returns year of the car
     * @return the year of the car
     */
    public int getYear(){
        return this.year;
    }

    /**
     * Returns price of the car
     * @return the price of the car
     */
    public double getPrice(){
        return this.price;
    }

    //setters

    /**
     * Sets the make of the car
     * @param make String - the new make of the car
     */
    public void setMake(String make){
        this.make = make;
    }

    /**
     * Sets the model of the car
     * @param model String - the new model of the car
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * Sets the year of the car
     * @param year int - the new year of the car
     */
    public void setYear(int year){
        this.year = year;
    }
    /**
     * Sets the price of the car
     * @param price double - the new price of the car
     */
    public void setPrice(double price){
        this.price = price;
    }

}