package MostenirePolimorfismAbstractizare;

public  abstract class Vehicle{

    private int speed;
    private int gear;

    public void changeGear(int gear){
    this.gear = gear;
    }

    public void speedUp (int increament){
        this.speed = this.speed + increament;
    }

    public  void applyBrakes(int decrement){
        this.speed = this.speed - decrement;
    }
    public abstract void printStates();

}
