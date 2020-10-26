package DittaRiparazioneCaldaie;

public class Riparazione {
    private String repairAddr="";
    private String state;//SE IN LAVORAZIONE, è PRESENTE IL NOME DEL TECNICO
    private int priority=0;

    public String getState(){
        return this.state;
    }
}
