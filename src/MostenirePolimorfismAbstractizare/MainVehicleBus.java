package MostenirePolimorfismAbstractizare;

public class MainVehicleBus {

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBrakes(1);
        truck.printStates();


        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBrakes(3);
        bus.printStates();
    }


}
