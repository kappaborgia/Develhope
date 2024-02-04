package JavaBasic.modulo3.ex3;

public class Quadrato {
    // Variabili d'istanza per definire i lati del quadrato
    private final int lato1;
    private final int lato2;

    //  Costruttore per inizializzare le due variabili
    public Quadrato(int lato1, int lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }



    // creo il metodo CalcolaArea()
    public void CalcolaArea(){
        int area = lato1 * lato2;
        System.out.println("L'area del quadrato è: " + area);
    }


}
