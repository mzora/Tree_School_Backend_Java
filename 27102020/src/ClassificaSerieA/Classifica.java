package ClassificaSerieA;

import java.util.Arrays;

public class Classifica {
    Squadra[] squadre;
    private int counterSquadre=0;

    public Classifica(int numeroSquadre){
        this.squadre = new Squadra[numeroSquadre];
    }

    public void addSquadra(Squadra s){
        if(counterSquadre<squadre.length){
            this.squadre[counterSquadre] =s;
            counterSquadre++;
        }else{
            System.out.println("Campionato al completo");
        }
    }

    public void esitoPartita(Squadra squadraCasa, int goalCasa, Squadra squadraOspite, int goalOspite){
        if(goalCasa>goalOspite){
            squadraCasa.setPunteggio(3);
        }else if(goalCasa==goalOspite){
            squadraCasa.setPunteggio(1);
            squadraOspite.setPunteggio(1);
        }else{
            squadraOspite.setPunteggio(3);
        }

        squadraCasa.setGolFatti(goalCasa);
        squadraOspite.setGolFatti(goalOspite);
        squadraCasa.setGolSubiti(goalOspite);
        squadraOspite.setGolSubiti(goalCasa);
    }

    public void getClassifica(){
        //ritorna la classifica attuale, ordinata per punteggio
        Squadra temp;

        for(int i = 0; i < squadre.length-1;i++){
            for(int j =0; j<squadre.length-i-1;j++){
                if(squadre[j].getPunteggio() < squadre[j+1].getPunteggio()){
                    temp = squadre[j];
                    squadre[j] = squadre[j+1];
                    squadre[j+1] = temp;
                }
            }
        }

        for(int i =0 ;i< squadre.length;i++){
            System.out.println("Squadra: "+squadre[i].getNomeSquadra()+" punteggio: "+squadre[i].getPunteggio());
        }
    }

    public void getMigliorAttacco(){
        //confronto gol fatti tra le squadre
    }

    public void getPeggiorDifesa(){
        //confronto gol subiti tra le squadre
    }
}
