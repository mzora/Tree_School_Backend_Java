package DittaRiparazioneCaldaie;

public class Tecnico {
    private String Cognome;
    private int ID;
    private boolean ferie = false;

    public Tecnico(int id, String cognome){
        this.Cognome=cognome;
        this.ID=id;
    }

    public String getTecnico(int id){
        if(id==this.ID)
            return this.Cognome;
        return "tecnico inesistente";
    }

    public String getTecnico(){
        return this.Cognome;
    }

    public void setFerie(boolean b){
        this.ferie = b;
    }
}
