package JavaBasic.modulo2.ex2;

public class Auto {
    private String Brand;
    private String Model;
    private int cc;
    private int cv;
    private String Targa;

    public Auto(String marca, String modello, int cc, int cv, String targa){
        this.Brand = marca;
        this.Model = modello;
        this.cc = cc;
        this.cv = cv;
        this.Targa = targa;
    }

    ///////////////////////////////////////
    public String getbrand(){
        return Brand;
    }
    public void setbrand(String Marca){
        this.Brand = Marca;
    }

    ///////////////////////////////////////
    public String getmodel(){
        return Model;
    }
    public void setmodel(String modello){
        this.Model = modello;
    }

    //////////////////////////////////////
    public int getcc(){
        return cc;
    }
    public void setcc(int cc){
        this.cc = cc;
    }

    ////////////////////////////////////
    public int getcv(){
        return cv;
    }
    public void setcv(int cv){
        this.cv = cv;
    }

    ////////////////////////////////////////
    public String gettarga(){
        return Targa;
    }
    public void settarga(String targa){
        this.Targa = targa;
    }
}
