package DittaRiparazioneCaldaie;

public class Riparazione {
    private String repairAddr;
    private String state;//SE IN LAVORAZIONE, è PRESENTE IL NOME DEL TECNICO(altrimenti null)
    private int priority=0;//da 1=min a 10=max, default 0

    public Riparazione(String r, int p){
        this.repairAddr=r;
        this.priority=p;
    }
    public Riparazione(String r, int p, String state){
        this.repairAddr=r;
        this.priority=p;
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRepairAddr(String r){
        this.repairAddr =r;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getRepairAddr() {
        return repairAddr;
    }
}
