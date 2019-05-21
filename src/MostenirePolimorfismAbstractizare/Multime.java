package MostenirePolimorfismAbstractizare;

public class Multime{

    private int[] date;
    private  int dim;
    private int n;

    public Multime(){
        this.date = date;
        this.dim = 10;
        this.n = n;
    }

    public Multime(int dim){
        this.dim = dim;
    }

    public void adauga(int a){
        for (int i = 0; i < date.length ; i++) {
            if(date[i] != a){

            }

        }

    }

    public void extrage(int a){

    }
    public void afisare(){
        System.out.println(dim);
    }
}
