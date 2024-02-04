package JavaBasic.modulo3.ex6;

enum TipoForma {
    TRIANGOLO, RETTANGOLO
}

// Classe base Forma
abstract class Forma {
    TipoForma tipo;

    Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    abstract double calcolaArea();
}