package Dizionario;

public class LetterNotPresentException extends Exception{
    public LetterNotPresentException(){
        System.out.println("letter not found");
    }
}
