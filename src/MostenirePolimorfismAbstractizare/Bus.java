package MostenirePolimorfismAbstractizare;

public class Bus extends Vehicle {


    @Override
    public void printStates() {
        System.out.println("Bus - speed: " + this.getSpeed() + " gear: " + this.getGear());
    }
}
