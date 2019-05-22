package MostenirePolimorfismAbstractizare;

public class MainSwimer {

    public static void main(String[] args) {

        Walker walker = new Walker();
        walker.breath();
        walker.walk();
        Swimmer swimmer = new Swimmer();
        swimmer.breath();
        swimmer.swim();
    }
}
