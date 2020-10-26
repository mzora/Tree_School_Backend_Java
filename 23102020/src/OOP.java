import javax.swing.*;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) throws Exception {
        //TestColore();
        //TestForme2();
        //TestLampadina();
        TestLampadina_2();
    }

    public static void TestContatore(){
        Contatore cont_1  = new Contatore();

        Contatore cont_2 = new Contatore(1);

        cont_2.IncrementaContatore();

        System.out.println(cont_2.getConteggio());

        cont_2.resetConteggio();

        cont_2.setConteggio(10);
        System.out.println(cont_2.getConteggio());
    }
    public static void TestForme1(){
        Quadrato quad = new Quadrato(6);
        quad.stampaQuadrato();

        System.out.println("");

        Cerchio cerc = new Cerchio(5);

        System.out.println("Area: "+ cerc.getArea()+", Circonferenza: "+cerc.getCirconferenza());
    }
    public static void TestColore() throws Exception {
        Colore giallo = new Colore(255,255,0);
        System.out.println(giallo.toString());
    }
    public static void TestForme2(){
        Quadrato quad = new Quadrato(5);
        quad.setColore(255,254,0);
        //System.out.println(quad.getColore().toString());

        Cerchio c = new Cerchio(5);
        System.out.println(c.getColore().toString());
    }
    public static void TestLampadina(){
        Lampadina bulb1 = new Lampadina();

        bulb1.click();
        bulb1.click();
        bulb1.click();
        bulb1.click();
        bulb1.click();
        bulb1.click();
    }
    public static void TestLampadina_2(){
        Lampadina bulb =new Lampadina();
        Interruttore int_1 = new Interruttore(bulb);
        Interruttore int_2 = new Interruttore(bulb);

        boolean gameOn = true;
        while(gameOn){

            System.out.println("Choose able Electricity: 1 or disable Electricity: 2 ");
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();

            if(i ==1){
                ImpiantoElettrico.circuitON();
            }else if(i == 2) {
                ImpiantoElettrico.circuitOFF();
            }

            System.out.println("Choose int1: 1 , int2: 2  or 4 to quit");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            if(input ==1){
                int_1.press();
            }else if(input == 2){
                int_2.press();
            }else if(input == 4){
                gameOn=false;
            }
        }
    }
}
