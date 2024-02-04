package JavaBasic.modulo2.ex1;

public class Studente {
    private String nome;

    private String cognome;

    private int ID;

    public Studente(String name, String surname, int ID ){
        this.nome = name;
        this.cognome = surname;
        this.ID = ID;
    }



    public String getnome(){
        return nome;
    }
    public void setNome(String name){
        this.nome = name;
    }



    public String getCognome(){
        return cognome;
    }
    public void setCognome(String surname){
        this.cognome = surname;   
    }



    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }


   



}
