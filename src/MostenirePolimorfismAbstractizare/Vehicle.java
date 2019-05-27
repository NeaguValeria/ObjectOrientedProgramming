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

    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
