package JavaBasic.modulo2.ex2;

/* Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata,
 * targa, marca e modello.
 */

public class Main {
    public static void main(String[] args) {
        Auto veicolo1 = new Auto("TOYOTA", "Supra", 2998, 340, "ET435FG");
        System.out.println("MARCA: " + veicolo1.getbrand());
        System.out.println("MODELLO: " + veicolo1.getmodel());
        System.out.println(veicolo1.getcc() + " CC");
        System.out.println(veicolo1.getcv() + " CV");
        System.out.println("TARGA: " + veicolo1.gettarga());
        System.out.println();

        veicolo1.setbrand("BMW");
        veicolo1.setmodel("M4");
        veicolo1.setcc(2998);
        veicolo1.setcv(431);
        veicolo1.settarga("GF178DB");
        System.out.println("MARCA: " + veicolo1.getbrand());
        System.out.println("MODELLO: " + veicolo1.getmodel());
        System.out.println(veicolo1.getcc() + " CC");
        System.out.println(veicolo1.getcv() + " CV");
        System.out.println("TARGA: " + veicolo1.gettarga());
        System.out.println();

        veicolo1.setbrand("VOLVO");
        veicolo1.setmodel("XC60");
        veicolo1.setcc(1969);
        veicolo1.setcv(455);
        veicolo1.settarga("FE749NP");
        System.out.println("MARCA: " + veicolo1.getbrand());
        System.out.println("MODELLO: " + veicolo1.getmodel());
        System.out.println(veicolo1.getcc() + " CC");
        System.out.println(veicolo1.getcv() + " CV");
        System.out.println("TARGA: " + veicolo1.gettarga());
        System.out.println();

        veicolo1.setbrand("FIAT");
        veicolo1.setmodel("CINQUECENTO");
        veicolo1.setcc(899);
        veicolo1.setcv(39);
        veicolo1.settarga("AL438CF");
        System.out.println("MARCA :" + veicolo1.getbrand());
        System.out.println("MODELLO :" + veicolo1.getmodel());
        System.out.println(veicolo1.getcc() + " CC");
        System.out.println(veicolo1.getcv() + " CV");
        System.out.println("TARGA :" + veicolo1.gettarga());


        
    }


}
