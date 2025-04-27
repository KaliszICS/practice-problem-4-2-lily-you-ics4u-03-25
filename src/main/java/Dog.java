/**
 * This Dog class allows users to acesss or modify the name, breed and weight of a dog
 * @author Lily You
 * @version 1
 */
public class Dog{
    //instances
    private String name;
    private String breed;
    private int weight;

    /**
     * Initializes the values of the variables name, breed, and weight
     * @param name String - the name of the dog
     * @param breed String - the breed of the dog
     * @param weight int - the weight of the dog
     */

    //constructor
    public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    //getters

    /**
     * Returns the name of the dog
     * @return the name of the dog as a string
     */

    public String getName(){
        return this.name;
    }

    /**
     * Returns breed of the dog
     * @return the breed of the dog as a string
     */
    public String getBreed(){
        return this.breed;
    }

    /**
     * Returns weight of the dog
     * @return the weight of the dog as an integer
     */
    public int getWeight(){
        return this.weight;
    }

    //setters

    /**
     * Sets the name of the dog
     * @param name String - new name for the dog
     */
    //setters
    public void setName(String name){
        this.name = name;
    }
    /**
     * Sets the breed of the dog
     * @param breed String - new breed for the dog
     */
    public void setBreed(String breed){
        this.breed = breed;
    }
    /**
     * Sets the weight of the dog
     * @param weight int - new weight for the dog
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

}