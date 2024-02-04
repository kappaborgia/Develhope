package JavaBasic.modulo1;
// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
// e restituisca il nome del giorno della settimana come stringa o una stringa di errore 
// nel caso di valore maggiore di 7 o minore di 1.

public class switch01 {
    public static void main(String[] args) {
        int day = 3;
        dayOfweek(day);
    }

    public static void dayOfweek(int day){
        switch(day){
            case 1:
                System.out.println("lunedi");
                break;
            case 2:
                System.out.println("martedi");
                break;
            case 3:
                System.out.println("mercoledi");
                break;
            case 4:
                System.out.println("giovedi");
                break;
            case 5:
                System.out.println("venerdi");
                break;
            case 6:
                System.out.println("sabato");
                break;
            case 7:
                System.out.println("domenica");
                break;
            default:
                System.out.println("errore");
                break;

        }
    }
    
}
