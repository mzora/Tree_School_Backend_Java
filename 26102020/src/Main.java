public class Main {
    public static void main(String[] args){

        TestTris();
        //TestNumeroRomano();
    }
    public static void TestTris(){
        Tris_TicTacToe partita = new Tris_TicTacToe();
        partita.gioca();
    }
    public static void TestNumeroRomano(){
        NumeroRomano num = new NumeroRomano("MMXIX");
        System.out.println(num.getValore());
    }


}
