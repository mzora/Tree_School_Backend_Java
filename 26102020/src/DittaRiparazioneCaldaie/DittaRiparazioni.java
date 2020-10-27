package DittaRiparazioneCaldaie;
//implementare rip terminata
public class DittaRiparazioni {
    Riparazione[] riparazioni = new Riparazione[100];
    Tecnico[] tecnici = new Tecnico[100];
    private int counterTecnici=0;
    private int counterRiparazioni=0;

    public void getAllRiparazioni(){
        for(int i=0;i< riparazioni.length;i++){
            if(riparazioni[i].getState()== null){
                System.out.println("Riparazione n."+i+", di indirizzo: "+riparazioni[i].getRepairAddr()+" non assegnata. Priorità: "+riparazioni[i].getPriority());
            }
        }
    }

    public void getHigherPriorityRip(){
        for(int i=0;i< riparazioni.length;i++){
            if(riparazioni[i].getPriority()== 10){
                System.out.println(riparazioni[i].getRepairAddr()+" URGENTE");
            }
        }
    }

    public void assignRepairToTecnico(int r, String nome){
        if(riparazioni[r].getState()==null){
            riparazioni[r].setState(nome);
            System.out.println("Riparazione "+r+", assegnata a "+nome);
        }else{
            System.out.println("Riparazione già assegnata e in lavorazione");
        }
    }

    public void repairInsert(String repairAddr, int priority){
        riparazioni[counterRiparazioni] = new Riparazione(repairAddr, priority);
        counterRiparazioni++;
        System.out.println("Riparazione inserita nel registro-array");
    }

    public void addTecnico(int id,String cognome){
        tecnici[counterTecnici] = new Tecnico(id, cognome);
        counterTecnici++;
        System.out.println("Tecnico inserito nel registro-array");
    }
    //manda in ferie un'array di stringhe
    public void setFerie(String cognome, boolean ferie){
        for(int i=0;i<tecnici.length;i++){
            if(tecnici[i].getTecnico()==cognome){
                tecnici[i].setFerie(ferie);
                break;
            }
        }
    }
}
