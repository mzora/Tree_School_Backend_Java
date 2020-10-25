public class OOP {
    public static void main(String[] args) throws Exception {
        //TestColore();
        TestForme2();
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

}
