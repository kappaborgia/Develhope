//Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza

public class functionLength {
    public static void main(String[] args){
        String myText = "hello";

        System.out.println("The length of my text is: " + length(myText));
    }

    public static int length (String myText){
        int myString = myText.length();
        return myString;
    }
}
