package FormeGeometriche;

public class Rettangolo extends FormaGeometrica {
    public Rettangolo(int x, int y) {
        super(x, y);
    }

    public String toString(){
        return "E' un rettangolo di lati:"+x+" e "+y;
    }
}
