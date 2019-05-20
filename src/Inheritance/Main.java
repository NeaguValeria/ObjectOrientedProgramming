package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAge(5);
        animal.setNumberOfLegs(4);
        animal.setVegetarian(true);
        System.out.println(animal.toString());

        animal.eat();

        Dog dog = new Dog(5,4,false,"black");
        System.out.println(dog.getAge() + " " + dog.getNumberOfLegs() + " " + dog.isVegetarian() + " " + dog.getColour());
        animal = new Dog();

    }
}
