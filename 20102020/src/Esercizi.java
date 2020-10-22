import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Collections;

public class Esercizi {
    public static void main(String[] args)
    {
        /*
        int[] numeriEstratti = {1,3,4,77,88,13,6,7,90,11,23,34,35,36,33,14,12,52,89,88};
        //int[] numeriEstratti = {15,2,3};
        int[][] tombola = {
                {15,2,3,4,5},
                {6,7,90,9,22},
                {33,12,77,14,15},
        };
        Tombola(numeriEstratti, tombola);*/
        /*
        System.out.println(Cripta("zora", 3));
        System.out.println(Decripta("crud", 3));
        */

        for(int i = 1; i<100; i++){
            if(numeroPerfetto(i))
                System.out.println("numero "+i);
        }
    }

    public static void Tombola(int[] estrazioni, int[][] scheda)
    {
        int ambi=0;
        int terne=0;
        int quaterne =0;
        int cinquine=0;
        int counter = 0;
        int righe = 3;
        int colonne=5;

        counter=0;
        for(int j=0; j < righe; j++){
            counter=0;
            for(int k=0; k < colonne; k++){
                for(int i=0; i < estrazioni.length; i++){
                    if(estrazioni[i]==scheda[j][k]){
                        counter++;
                    }
                }
            }
            if(counter ==2){
                ambi++;
            }else if(counter == 3){
                terne++;
            }else if(counter==4){
                quaterne++;
            }else if(counter==5){
                cinquine++;
            }
        }
        if(cinquine==3){
            System.out.println("Tombola");
        }else {
            System.out.println("ambi" + ambi);
            System.out.println("terne" + terne);
            System.out.println("quaterne" + quaterne);
            System.out.println("cinquine" + cinquine);
        }
    }

    public static String Cripta(String s, int key){
        s = s.toLowerCase();
        char[] wordToCript = s.toCharArray();
        int[] AsciiCodeArr = new int[s.length()];
        String coded = "";

        for(int i=0; i<wordToCript.length; i++){
            AsciiCodeArr[i] = (int)wordToCript[i]+key;
        }

        for(int i=0; i < AsciiCodeArr.length; i++){
            if(AsciiCodeArr[i]>122)
            {
                AsciiCodeArr[i] = 96+(AsciiCodeArr[i]-122);
            }
        }

        for(int i=0;i< AsciiCodeArr.length; i++){
            coded+= (char)AsciiCodeArr[i]+"";
        }

        return coded;
    }

    public static String Decripta(String s, int key){
        s = s.toLowerCase();
        char[] wordToDEcript = s.toCharArray();
        int[] AsciiCodeArr = new int[s.length()];
        String coded = "";

        for(int i=0; i<wordToDEcript.length; i++){
            AsciiCodeArr[i] = (int)wordToDEcript[i]-key;
        }

        for(int i=0; i < AsciiCodeArr.length; i++){
            if(AsciiCodeArr[i]<97)
            {
                AsciiCodeArr[i] = 96+(122-AsciiCodeArr[i]);
            }
        }

        for(int i=0;i< AsciiCodeArr.length; i++){
            coded+= (char)AsciiCodeArr[i]+"";
        }

        return coded;
    }

    public static boolean numeroPerfetto(int n){
        int counterDivisori = 0;
        for(int i =1; i<n; i++){
            if(n%i==0){
                counterDivisori++;
            }
        }

        int[] divisori = new int[counterDivisori];
        for(int i = 1; i<n; i++){
            int counterDivisorPosition = 0;
            if(n%i==0){
                divisori[counterDivisorPosition]=i;
                counterDivisorPosition++;
            }
        }

        int sommaDivisori = 0;
        for(int i = 0; i<divisori.length;i++){
            sommaDivisori +=divisori[i];
        }
        if(n==sommaDivisori){
            return true;
        }
        return false;
    }
}
