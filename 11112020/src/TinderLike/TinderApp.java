package TinderLike;
import java.util.*;

public class TinderApp {
    private Map<Utente,HashSet<Interesse>> lista;

    public TinderApp(){
        this.lista= new HashMap<>();
    }

    public void addUtente(Utente utente){
        lista.put(utente,utente.getInterestedIn());
    }

    public void addInterestToUser(Utente user,Interesse newInteresse){
        //crea un set temporaneo dove aggiungere l'interesse e poi fai addAll per aggiugere
        //l'interesse agli altri gia presenti
        Set temp = new HashSet();
        temp.add(newInteresse);
        if(lista.containsKey(user)){
            lista.get(user).addAll(temp);
        }
        lista.get(user);
    }

    public void remUtente(Utente utente){
        lista.remove(utente);
    }

    public Map<Utente, HashSet<Interesse>> getLista() {
        return lista;
    }

    public Utente findMatch(Utente u1){
        Utente matched = null;
        Set<Interesse> u1Interessi =u1.getInterestedIn();
        int counter=0;

        for(Utente u : lista.keySet()){
            if(u.equals(u1))
                continue;
            Set<Interesse> interessiComuni=new HashSet<>(lista.get(u));
            interessiComuni.retainAll(u1Interessi);
            if(interessiComuni.size() > counter) {
                matched = u;
                counter = interessiComuni.size();
            }
        }

        if(matched==null)
            return new Utente("nessuno",null);

        return matched;
    }


}
