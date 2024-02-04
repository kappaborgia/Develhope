package JavaBasic.modulo3.ex6;

// Sottoclasse Rettangolo
public class Rettangolo extends Forma {
    double lunghezza;
    double larghezza;

    Rettangolo(double lunghezza, double larghezza) {
        super(TipoForma.RETTANGOLO);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    double calcolaArea() {
        return lunghezza * larghezza;
    }
}

