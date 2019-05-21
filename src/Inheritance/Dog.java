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

    public void bark(){
        System.out.println(" gaf-gaf");
    }

    @Override
    public String toString(){
        return super.toString() + this.colour;
    }
}
