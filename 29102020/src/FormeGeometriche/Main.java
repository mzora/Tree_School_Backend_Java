package FormeGeometriche;

public class Main {
    public static void main(String[] args){
        FormaGeometrica quad_6 = new Quadrato(6,6);
        FormaGeometrica rett_6_5 = new Rettangolo(6,5);
        quad_6.getArea();
        quad_6.getPerimeter();
        quad_6.toString();

        rett_6_5.getArea();
        rett_6_5.getPerimeter();
        rett_6_5.toString();
    }

}
