package MostenirePolimorfismAbstractizare;

public class Swimmer implements Swim, Breath {
    @Override
    public void breath() {
        System.out.println("swimmer can breath");
    }

    @Override
    public void swim() {
        System.out.println("swimmer can swim");
    }
}
