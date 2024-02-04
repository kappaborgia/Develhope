package JavaBasic.modulo3.ex2;
/* Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() 
che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() 
per calcolare l'area del rettangolo. */


// sottoclasse che estende la classe forma
public class Rettangolo extends Forma{
    // Variabili di istanza per la lunghezza e larghezza del rettangolo
    private final float lunghezza;
    private final float larghezza;

    // Costruttore per inizializzare le dimensioni del rettangolo
    public Rettangolo(float lunghezza, float larghezza){
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    // Override del metod calcolaArea() per calcolare l'area del rettangolo 
   @Override
   public double calcolaArea(){
       double area = lunghezza * larghezza;
       System.out.println("Rettangolo: " + area);


       return area;
   }
    
    
    
}
