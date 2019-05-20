package Inheritance;

public class Dog extends Animal {

    private String colour;

    public Dog(int age, int numberOfLegs, boolean vegetarian, String colour){

        super(age, numberOfLegs,vegetarian);
        this.colour = colour;
    }

    public Dog() {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
