public class Main {
    public static void main(String[] args){
        //Tris_TicTacToe partita = new Tris_TicTacToe();
        //partita.gioca();
        TestNumeroRomano();
    }

    public static void TestNumeroRomano(){
        NumeroRomano num = new NumeroRomano("MMXIX");
        System.out.println(num.getValore());
    }
}
