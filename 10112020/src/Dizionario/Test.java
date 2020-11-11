package Dizionario;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws ParolaException, LetterNotPresentException {

        Dizionario dictionary = new Dizionario();
        dictionary.addParola("calcio","sport");
        dictionary.addParola("calcio","elemento chimico");

        Set<String> significatoAggiuntivo = new HashSet<>();
        significatoAggiuntivo.add("sport");
        dictionary.addSignificatoParola("calcio",significatoAggiuntivo);

        dictionary.addParola("noce","frutto");
        significatoAggiuntivo.clear();
        significatoAggiuntivo.add("colore");
        dictionary.addSignificatoParola("noce",significatoAggiuntivo);

        significatoAggiuntivo.clear();
        significatoAggiuntivo.add("il");

        try {
            dictionary.addSignificatoParola("articolo", significatoAggiuntivo);
        } catch (LetterNotPresentException e) {

        } catch (ParolaException e) {

        }

        System.out.println(dictionary.stampaDizionario());
    }
}
