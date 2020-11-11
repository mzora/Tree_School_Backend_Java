package Dizionario;

import java.util.*;

public class Dizionario {
    Map<Character, TreeMap<String,TreeSet<String>>> dizionario;

    public Dizionario(){
        dizionario= new TreeMap<>();
    }

    public void addParola(String parola, String significato){
        if(parola == null || significato == null)
            return;

        char lettera = parola.charAt(0);

        if(!dizionario.containsKey(lettera)){
            TreeMap<String,TreeSet<String>> parolaEsign = new TreeMap<>();
            TreeSet<String> significati = new TreeSet<>();
            significati.add(significato);
            parolaEsign.put(parola,significati);
            this.dizionario.put(lettera,parolaEsign);
        }else{
            if(dizionario.get(lettera).containsValue(parola)){
                dizionario.get(lettera).get(parola).add(significato);
            }else{
                TreeSet<String> significati = new TreeSet<>();
                significati.add(significato);
                dizionario.get(lettera).put(parola,significati);
            }
        }
    }

    public void addSignificatoParola(String parola, Set<String> significati) throws ParolaException, LetterNotPresentException {
        parola=parola.toLowerCase();
        char lettera = parola.charAt(0);

        if(!dizionario.containsKey(lettera))
            throw new LetterNotPresentException();
        if(!dizionario.get(lettera).containsKey(parola))
            throw new ParolaException();
        dizionario.get(lettera).get(parola).addAll(significati);
    }

    public String stampaDizionario(){
        String text = "";
        for (Character letter : dizionario.keySet()) {
            Set<String> words = new HashSet<>();
            for (String word : dizionario.get(letter).keySet()) {
                String meanings = String.join(";", dizionario.get(letter).get(word));
                words.add(word + ": (" + meanings + ")");
            }
            text += letter + ":[" + String.join(", ", words) + "]\n";
        }
        return text;
    }

}
