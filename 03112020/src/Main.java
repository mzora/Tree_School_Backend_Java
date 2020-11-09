public class Main {
    public static void main(String[] args) {
        TrenoRegionale tr = new TrenoRegionale(1155);
        FrecciaRossa fr = new FrecciaRossa(2255);
        tr.Partire();
        VagonePasseggero vp= new VagonePasseggero(0000);

        tr.addVagone(vp);//cdz mancante

        tr.Frenare();
        tr.addVagone(vp);//cdz mancante

        tr.EntrareInStazione(1001);
        tr.addVagone(vp);//add vagone ok

        Passeggero p1 = new Passeggero(1234,"mario",0000, 9999);
        Passeggero p2 = new Passeggero(2345,"carlo",0001, 9998);
        vp.AddRemPasseggero(p1,true);//psg up ok
        vp.AddRemPasseggero(p2,true);//psg not ok vagone errato

        tr.remVagone(vp);//cdz mancante(psg up)

        vp.AddRemPasseggero(p1,false);//psg down
        tr.remVagone(vp);//rem vagone ok

        Vagone v =new Vagone(0001);
        tr.addVagone(v);//cdz mancante(vagone non passeggero)




    }
}
