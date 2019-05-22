package MostenirePolimorfismAbstractizare;

public class Multime{

    private int[] date;
    private  int dim;
    private int n;

    public Multime(){
        this.date = date;
        this.dim = 10;
        this.n = 0;
    }

    public Multime(int dim){
        this.dim = dim;
        this.date = new int[dim];
    }

    public void adauga(int a){
        boolean present = false;
        boolean plin = false;
        if(date[date.length -1] == 0) {
            for (int i = 0; i < date.length; i++) {
                if (date[i] == a) {
                    present = true;
                }
            }
            if (present) {
                System.out.println("Elementul exista");
            } else {
                int i = 0;
                boolean contor = true;
                while (contor) {
                    if (date[i] == 0) {
                        date[i] = a;
                        n++;
                        contor = false;
                    }
                    i++;
                }
            }
        } else {
            System.out.println("eroare");
        }
    }

    public void extrage(int a){
        for (int i = 0; i < date.length ; i++){
            if(date[i] != a){

            }
        }

    }
    public void afisare(){
        System.out.println();
        for (int i = 0; i <= date.length -1; i++) {
            System.out.print(" " + date[i]);
        }
    }
}
