package Inheritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import static sun.misc.Version.print;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAge(5);
        animal.setNumberOfLegs(4);
        animal.setVegetarian(true);
        System.out.println(animal.toString());

        animal.eat();

        Dog dog = new Dog(5, 4, false, "black");
        System.out.println("Dog is " + dog.getAge() + " years old " + ",he have " + dog.getNumberOfLegs() + " legs" + " " + (dog.isVegetarian() ? "vegetarian" : "not vegetarian" + " " + dog.getColour()));
        animal = new Dog();

        dog.bark();
        ((Dog) animal).bark();


        Dog dog1 = new Dog();
        dog1.setAge(6);
        dog1.setNumberOfLegs(4);
        dog1.setVegetarian(false);
        dog1.setColour("black");

        System.out.println(dog1.toString());

        Animal animal1 = new Animal();
        animal1.setAge(8);
        animal1.setNumberOfLegs(4);
        animal1.setVegetarian(false);

        System.out.println(animal1.toString());
        animal1 = dog1;

        printDetails(animal1);
        printDetails(dog1);

    }

    public static void printDetails(Animal animal){
        System.out.println(animal.toString());
    }


}

