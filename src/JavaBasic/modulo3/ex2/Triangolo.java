package JavaBasic.modulo3.ex2;

public class Triangolo extends Forma {
    // Variabili di istanza per base e altezza del triangolo
    private final float base;
    private final float height;

    // Costruttore per inizializzare le dimensioni del triangolo
    public Triangolo(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcolaArea(){
        double area = (base * height) / 2;
        System.out.println("Triangolo: " + area);
        return area;
    }


    
}
