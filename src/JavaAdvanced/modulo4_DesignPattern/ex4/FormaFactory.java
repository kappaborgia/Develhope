package JavaAdvanced.modulo4_DesignPattern.ex4;

public class FormaFactory {
    public static Forma creaForma(TipoForma tipoForma) {
        return switch (tipoForma) {
            case QUADRATO -> new Quadrato();
            case TRIANGOLO -> new Triangolo();
            case RETTANGOLO -> new Rettangolo();
            case CERCHIO -> new Cerchio();
            default -> throw new IllegalArgumentException("Tipo di forma non supportato");
        };
    }
}
