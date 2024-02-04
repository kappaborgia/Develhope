package JavaBasic.modulo3.ex6;


    // Sottoclasse Triangolo
public class Triangolo extends Forma {
        private final double base;
        private final double altezza;

        Triangolo(double base, double altezza) {
            super(TipoForma.TRIANGOLO);
            this.base = base;
            this.altezza = altezza;
        }

        @Override
        double calcolaArea() {
            return 0.5 * base * altezza;
        }
    }


