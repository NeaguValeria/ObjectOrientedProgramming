package MostenirePolimorfismAbstractizare;

public class Walker implements Walk, Breath {
    @Override
    public void breath() {
        System.out.println("walker can breath");
    }

    @Override
    public void walk() {
        System.out.println("walker can walk");
    }
}
