package Encapsulation;

public class Main {

    public static void main(String[] args) {

        final User user = new User("IonP","Ion","Popescu" );
        final User user1 = new User("ValeriaN", "Valeria", "Neagu");

        System.out.println(user.generateDisplayName() +"\n" + user1.generateDisplayName());


    }
}
